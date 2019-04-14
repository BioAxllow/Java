package Api.impl;

import dao.Dao;
import entities.Cart;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/cart")
public class CartService extends BaseService<Cart> {

    @Override
    protected Class<Cart> getEntityClass() {
        return Cart.class;
    }

    @POST
        @Override
        public Response add(Cart cart){
            Dao<Cart> dao= createDao();
            cart.setUuid(UUID.randomUUID());
        dao.create(cart);
        return Response.ok(cart).build();
    }



}
