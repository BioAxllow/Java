package Api.impl;

import Api.ProductService;
import dao.Dao;
import entities.Product;
import helpers.EntityManagerHelper;

import javax.ws.rs.core.Response;


public class ProductServiceImpl implements ProductService {
    @Override
    public Response add(Product e) {
        return null;
    }

    @Override
    public Response delete(int id) {

        return null;
    }

    @Override
    public Response get(int id) {
        return null;
    }

    @Override
    public Response update(int id, Product e) {
        return null;
    }

    @Override
    public Response getPage(int size, int skip) {
        Dao<Product> productDao=new Dao<>(EntityManagerHelper.getEntityManager());
        return Response.ok().entity(productDao.list(Product.class, size, skip)).build();
    }


}
