package ntt.com.example.webfluxappmicro;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@org.springframework.stereotype.Service
public class Service {

    public Flux<Person> allPersons() {

        Flux<Person> person1 = WebClient.create("http://localhost:8080/person-list-1").get().retrieve().bodyToFlux(Person.class);
        Flux<Person> person2 = WebClient.create("http://localhost:8080/person-list-2").get().retrieve().bodyToFlux(Person.class);

        Flux<Person> allPersons = Flux.merge(person1, person2);

        return allPersons;
    }




}
