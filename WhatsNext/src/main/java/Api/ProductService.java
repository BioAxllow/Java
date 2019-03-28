package Api;

import dao.Dao;
import entities.Invoice;
import entities.Product;
import helpers.EntityManagerHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/product")
public interface ProductService extends BaseService<Product> {
}
//    @POST
//    Response add(Product e);
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
//    Response update(@PathParam("id") int id, Product e);
//
//    @GET
//    @Path("/list")
//    Response getPage(@QueryParam("size") @DefaultValue("10") int size, @QueryParam("skip") @DefaultValue("0") int skip);

//}

