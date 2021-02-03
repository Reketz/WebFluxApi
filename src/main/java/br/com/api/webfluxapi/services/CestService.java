package br.com.api.webfluxapi.services;

import br.com.api.webfluxapi.document.CEST;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CestService {
    Flux<CEST> findAll();
    Mono<CEST> findById(String id);
    Mono<CEST> save(CEST cest);
}
