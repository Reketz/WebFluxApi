package br.com.api.webfluxapi.services;

import br.com.api.webfluxapi.document.CEST;
import br.com.api.webfluxapi.repository.CestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CestServiceImpl implements CestService{

    @Autowired
    public CestRepository cestRepository;

    public CestServiceImpl(CestRepository cestRepository) {
        this.cestRepository = cestRepository;
    }
    
    @Override
    public Flux<CEST> findAll() {
        return cestRepository.findAll();
    }

    @Override
    public Mono<CEST> findById(String id) {
        return cestRepository.findById(id);
    }

    @Override
    public Mono<CEST> save(CEST cest) {
        return cestRepository.save(cest);
    }

}
