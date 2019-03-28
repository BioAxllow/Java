package Api;

import entities.Invoice;
import entities.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/invoice")
public interface InvoiceService extends BaseService<Invoice> {
}
//    @POST
//    Response add(Invoice e);
//
//    @DELETE
//    @Path("/{id}")
//    Response delete(@PathParam("id") int id);
//
//    @GET
//    @Path("/{id}")
//    Response get(@PathParam("id") int id);
//
//    @PUT
//    @Path("/{id}")
//    Response update(@PathParam("id") int id, Invoice e);
//
//    @GET
//    @Path("/list")
//    Response getPage(@QueryParam("size") @DefaultValue("10") int size, @QueryParam("skip") @DefaultValue("0") int skip);

//}
