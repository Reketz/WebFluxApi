package br.com.api.webfluxapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class CestRouter {
    
    @Bean
    public RouterFunction router(CestHandler cestHandler){
        return RouterFunctions
                .route(GET("/cest").and(accept(MediaType.APPLICATION_JSON)), cestHandler::findAll)
                .andRoute(GET("/cest/{id}").and(accept(MediaType.APPLICATION_JSON)), cestHandler::findById)
                .andRoute(POST("/cest/save").and(accept(MediaType.APPLICATION_JSON)), cestHandler::save);                
    }
    

}
