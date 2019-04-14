package Api.impl;

import dao.Dao;
import entities.Invoice;
import entities.Product;
import filters.AccessRoles;
import filters.Role;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductService extends BaseService<Product> {


    @Context //<- injects info when UserService object is created
    private HttpServletRequest servletRequest;

    @Override
    protected Class<Product> getEntityClass() {
        return Product.class;
    }

    @AccessRoles({Role.USER, Role.ADMIN})
    @Override
    public Response list(int size, int skip) {
//        HttpSession session= servletRequest.getSession();
//
//        if (session.getAttribute("user") != null){
//            return super.list(size,skip);
//        }
//        return Response.status(Response.Status.UNAUTHORIZED).build();
        return super.list(size, skip);
    }


}