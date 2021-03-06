package br.com.api.webfluxapi.controller;

import br.com.api.webfluxapi.document.CEST;
import br.com.api.webfluxapi.services.CestService;
import java.time.Duration;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CestController {

    @Autowired
    CestService cestService;

    @GetMapping(value = "/cest")
    public Flux<CEST> findAll() {
        return cestService.findAll();
    }

    @GetMapping(value = "/cest/{id}")
    public Mono<CEST> findById(@PathVariable String id) {
        return cestService.findById(id);
    }

    @PostMapping(value = "cest/add")
    public Mono<CEST> save(@RequestBody CEST cest) {
        return cestService.save(cest);
    }

    @GetMapping(value = "/cest/webflux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, CEST>> getCestByWebflux() {
        System.out.println("---Start get Playlists by WEBFLUX--- " + LocalDateTime.now());
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<CEST> cestFlux = cestService.findAll();
        return Flux.zip(interval, cestFlux);
    }

}
