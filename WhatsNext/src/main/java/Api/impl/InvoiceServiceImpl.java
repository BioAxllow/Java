package Api.impl;

import Api.impl.requests.AddInvoiceLineRequest;
import dao.Dao;
import entities.InvLine;
import entities.Invoice;
import entities.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceServiceImpl extends BaseService<Invoice> {


    @Context //<- injects info when UserService object is created
    private HttpServletRequest servletRequest;

    @Override
    protected Class<Invoice> getEntityClass() {
        return Invoice.class;
    }

    @Override
    public Response list(int size, int skip) {
        HttpSession session = servletRequest.getSession();

//        if (session.getAttribute("user") != null) {
//            return super.list(size, skip);
//        }
//        return Response.status(Response.Status.UNAUTHORIZED).build();
        return super.list(size, skip);
    }

    //cookies name, galiojimo laikas, psl is kurio atejo,


    @GET
    @Path("/{id}/f")
    public Response getFull(@PathParam("id") int id) {

        Dao<Invoice> invoiceDao = createDao();
        Invoice entity = invoiceDao.read(id, Invoice.GRAPH_LINES);

        if (entity == null) return Response.status(Response.Status.NOT_FOUND).build();
        return Response.ok(entity).build();

    }

    @POST
    @Path("/{id}")
    public Response addInvoiceLine(@PathParam("id") int id, AddInvoiceLineRequest addInvoiceLineRequest) {

        Dao<Invoice> invoiceDao = createDao();
        Invoice invoice = invoiceDao.read(id);

        Dao<Product> productDao = new Dao<>(Product.class);
        Product product = productDao.read(addInvoiceLineRequest.getId());
        if (product == null) return Response.status(Response.Status.NOT_FOUND).build();

        if (invoice == null) return Response.status(Response.Status.NOT_FOUND).build();
        InvLine invLine = new InvLine();
        invLine.setInvoice(invoice);
        invLine.setQuantity(addInvoiceLineRequest.getQty());
        invLine.setProduct(product);
        invLine.setPrice(product.getPrice());

        invoice.getInvLines().add(invLine);
        invoice = invoiceDao.update(invoice);
        return Response.ok(invoice).build();

    }
}
