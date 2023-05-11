package ntt.com.example.webfluxservermicro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class Controller {

    Person person1 = new Person("Antonio", "Nunez", 25);
    Person person2 = new Person("Pepe", "Rodriguez", 19);

    Person person3 = new Person("Claudia", "Rodriguez", 22);


    Person person4 = new Person("Maria", "Plaza", 29);



    @GetMapping( "/person-list-1")
    public Flux<Person> personList1(){

        Flux<Person> lista = Flux.just(person1, person2).delaySequence(Duration.ofSeconds(1));

        return lista;

    }


    @GetMapping( "/person-list-2")
    public Flux<Person> personList2(){

        Flux<Person> lista = Flux.just(person3, person4).delaySequence(Duration.ofSeconds(1));

        return lista;

    }
}
