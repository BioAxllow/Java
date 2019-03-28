package Api.impl;

import Api.InvoiceService;
import dao.Dao;
import entities.Invoice;
import helpers.EntityManagerHelper;

import javax.ws.rs.core.Response;

public class InvoiceServiceImpl implements InvoiceService {
    @Override
    public Response add(Invoice e) {
        return null;
    }

    @Override
    public Response delete(int id) {
        Dao<Invoice> invoiceDao=new Dao<>(EntityManagerHelper.getEntityManager());
        Invoice invoice=invoiceDao.read(Invoice.class,id);
        if (invoice == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }else {
            invoiceDao.delete(invoice);
        }
        return Response.ok().entity(invoice).build();
    }

    @Override
    public Response get(int id) {
        return null;
    }

    @Override
    public Response update(int id, Invoice e) {
        return null;
    }

    @Override
    public Response getPage(int size, int skip) {
        return null;
    }

//    public Response add(Invoice e) {
//        Dao<Invoice> invoiceDao=new Dao<>(EntityManagerHelper.getEntityManager());
//        if (e==null){
//            return Response.status(Response.Status.NO_CONTENT).build();
//        }
//        Invoice invoice=invoiceDao.create(e);
//        return Response.ok().entity(invoice).build();
//    }
//
//
//
//    public Response get(int id) { //gautas id, bus perduotas  @PathParam("id") int id, @PathParam("a") int oe
//        Dao<Invoice> invoiceDao = new Dao<>(EntityManagerHelper.getEntityManager());
//        Invoice invoice = invoiceDao.read(Invoice.class, id);
//        if (invoice == null) {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//        return Response.ok().entity(invoice).build();
//    }
//
//
//    public Response update( int id, Invoice e) {
//        Dao<Invoice> invoiceDao=new Dao<>(EntityManagerHelper.getEntityManager());
//        Invoice invoice=invoiceDao.read(Invoice.class,id);
//
//
//        invoiceDao.update(e);
//        return null;
//    }
//
//
//    public Response getPage(int size, int skip) {
//        return null;
//    }
}
