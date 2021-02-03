//package br.com.api.webfluxapi;
//
//import br.com.api.webfluxapi.document.CEST;
//import br.com.api.webfluxapi.repository.CestRepository;
//import java.util.UUID;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Flux;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//    private final CestRepository cestRepository;
//
//    public DummyData(CestRepository cestRepository) {
//        this.cestRepository = cestRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        CEST cest1 = new CEST(UUID.randomUUID().toString(), "0111000", "73145000", "Corrente de transmissão");
//        CEST cest2 = new CEST(UUID.randomUUID().toString(), "0111100", "73151100", "Corrente transmissão");
//        CEST cest3 = new CEST(UUID.randomUUID().toString(), "0111700", "84314100", "Caçambas, pás, ganchos e tenazes para máquinas rodoviárias");
//        CEST cest4 = new CEST(UUID.randomUUID().toString(), "0111800", "85016100", "Geradores de corrente alternada de potência não superior a 75 kva");
//        cestRepository.deleteAll().thenMany(
//                Flux.just(cest1, cest2, cest3, cest4).flatMap(cestRepository::save)
//        ).subscribe(System.out::println);
//        
////        cestRepository.deleteAll()
////                .thenMany(
////                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
////                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
////                                .map(nome -> new CEST(UUID.randomUUID().toString(), nome))
////                                .flatMap(cestRepository::save))
////                .subscribe(System.out::println);
//    }
//
//}
