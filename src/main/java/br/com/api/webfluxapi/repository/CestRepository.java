package br.com.api.webfluxapi.repository;

import br.com.api.webfluxapi.document.CEST;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CestRepository extends ReactiveMongoRepository<CEST, String>{

}
