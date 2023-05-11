package org.example;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.util.annotation.NonNull;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Main {
    public static void main(String[] args) {

        Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
        publisher.subscribe(m -> System.out.println("Consumer 1 : Received" + m),
                e -> System.out.println("Consumer 1 : Error" + e.getMessage()),
        () -> System.out.println( "Consumer 1 : Completed"));;

        publisher.subscribe(m -> System.out.println("Consumer 2 : Received" + m),
                e -> System.out.println("Consumer 2 : Error"+ e.getMessage()),
                () -> System.out.println( "Consumer 2 : Completed"));;

    }
}