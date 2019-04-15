package Api.impl;

import Api.impl.requests.AddCartLineRequest;
import dao.Dao;
import entities.Cart;
import entities.CartLine;
import entities.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Optional;

@Path("/cart")
public class CartService extends BaseService<Cart> {

    @Override
    protected Class<Cart> getEntityClass() {
        return Cart.class;
    }

    @Context
    private HttpServletRequest servletRequest;


//    @Override
//    public Response add(Cart cart) {
//        Dao<Cart> dao = createDao();
//        dao.create(cart);
//        return Response.ok(cart).build();
//    }


    @POST
    @Path("/{id}")
    public Response addCartLine(@PathParam("id") int cartId, AddCartLineRequest addCartLineRequest) {

        int productId = addCartLineRequest.getId();
        int qty = addCartLineRequest.getQty();

        try (Dao<Cart> cartDao = createDao()) {

            // 1
            Cart cart = cartDao.read(cartId);
            if (cart == null)
                // jeigu cart=null sukurti nauja
                return Response.status(Response.Status.NOT_FOUND).build();

            // 2
            Dao<Product> productDao = new Dao<>(Product.class);
            Product product = productDao.read(productId);
            if (product == null)
                return Response.status(Response.Status.NOT_FOUND).build();

            // 3 patikrinti ar cart.crtLine turi tokia preke
            boolean isCartLine = false;
            for (CartLine cartLine : cart.getCartLines()) {

                // jei turi pridėti qty
                if (cartLine.getProduct().getId() == product.getId()) {

                    cartLine.setQty(cartLine.getQty() + qty);
                    isCartLine = true;
                    break;
                }
            }

            // jei neturi sukurti nauja cartLine ir paduoti i cart
            if (!isCartLine) {

                CartLine cartLine = new CartLine();
                cartLine.setCart(cart);
                cartLine.setQty(qty);
                cartLine.setProduct(product);
                cart.getCartLines().add(cartLine);
            }

            cart = cartDao.update(cart);
            return Response.ok(cart).build();
        }
    }

    @GET // READ_LIST
    @Path("/list")
    public Response list(@QueryParam("size") @DefaultValue("10") int size, @QueryParam("skip") @DefaultValue("0") int skip) {

        Dao<Cart> dao = createDao();
        return Response.ok().entity(dao.list(size, skip)).build();
    }

    // gauti full list
    @GET
    @Path("/{id}/f")
    public Response getFull(@PathParam("id") int id) {

        try (Dao<Cart> dao = createDao()) {
            Cart entity = dao.read(id, Cart.GRAPH_CART_LINES);

            if (entity == null)
                return Response.status(Response.Status.NOT_FOUND).build();

            return Response.ok(entity).build();
        }
    }

    @POST
    @Path("/add")
    public Response addCartLine(AddCartLineRequest addCartLineRequest) {

        Dao<Product> productDao = new Dao<>(Product.class);
        Product product = productDao.read(addCartLineRequest.getId());
        if (product == null) return Response.status(Response.Status.NOT_FOUND).build();

        HttpSession session = servletRequest.getSession();

        Object obj = session.getAttribute("cart");
        Cart cart;
        if (obj instanceof Cart) {
            cart = (Cart) obj;
        } else {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        if (cart.getCartLines() == null) cart.setCartLines(new HashSet<>());

        Optional<CartLine> line = cart.getCartLines().stream()
                .filter(x -> x.getProduct().getId() == addCartLineRequest.getId())
                .findFirst();

        if (line.isPresent()) {
            CartLine cartLine = line.get();
            cartLine.setQty(cartLine.getQty() + addCartLineRequest.getQty());
        } else {
            CartLine cartLine = new CartLine();
            cartLine.setProduct(product);
            cartLine.setQty(addCartLineRequest.getQty());
            cart.getCartLines().add(cartLine);
        }

        return Response.ok(cart).build();
    }

    @GET
    public Response getCart() {
        HttpSession session = servletRequest.getSession();
        return Response.ok(session.getAttribute("cart")).build();
    }

}
