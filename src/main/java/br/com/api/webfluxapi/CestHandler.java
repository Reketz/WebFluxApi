package br.com.api.webfluxapi;

import br.com.api.webfluxapi.document.CEST;
import br.com.api.webfluxapi.services.CestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import reactor.core.publisher.Mono;

@Component
public class CestHandler {

    @Autowired
    CestService cestService;

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok().contentType(MediaType.APPLICATION_JSON)
                .body(cestService.findAll(), CEST.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok().contentType(MediaType.APPLICATION_JSON)
                .body(cestService.findById(id), CEST.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<CEST> cest = request.bodyToMono(CEST.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(cest.flatMap(cestService::save), CEST.class));
    }
    
}
