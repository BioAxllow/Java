package Api;

import Api.impl.InvoiceServiceImpl;
import Api.impl.ProductServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;


@ApplicationPath("/api")
public class App extends ResourceConfig {

    public App() {
        register(ObjectMapperContextResolver.class);
        register(InvoiceServiceImpl.class);
        register(ProductServiceImpl.class);
        property(ServerProperties.RESPONSE_SET_STATUS_OVER_SEND_ERROR, true); //jeigu grazinsim 401 403 kodus, tai nematysim standartinio tomacat psl
    }

    //extends Application
//    @Override
//    public Set<Class<?>> getClasses(){
//        Set<Class<?>> resources = new HashSet<>();
//        resources.add(ObjectMapperContextResolver.class);
//        resources.add(InvoiceServiceImpl.class);
//
//        return resources;
//    }
}
