package Api;

import Api.impl.CartService;
import Api.impl.InvoiceServiceImpl;
import Api.impl.ProductService;
import Api.impl.UserService;
import filters.AccessRoles;
import filters.AuthenticationFilter;
import filters.Role;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;


@ApplicationPath("/api")
public class App extends ResourceConfig {

    public App() {
        register(ObjectMapperContextResolver.class);
        register(InvoiceServiceImpl.class);
        register(ProductService.class);
        register(UserService.class);
        register(CartService.class);

//        register(AccessRoles.class);
//        register(AuthenticationFilter.class);
//        register(Role.class);

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
