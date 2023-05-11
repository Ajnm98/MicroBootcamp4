package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Main {


    public static void main(String[] args) {

        Observable<String> mensaje = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");

        mensaje.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {
                System.out.println("Observer 1. Suscrito");
            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println("Observer 1. Recibido ");
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                System.out.println("Observer 1. Error ");
            }

            @Override
            public void onComplete() {
                System.out.println("Observer 1. Completado ");
            }
        });

        mensaje.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {
                System.out.println("Observer 2. Suscrito");
            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println("Observer 2. Recibido ");
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                System.out.println("Observer 2. Error ");
            }

            @Override
            public void onComplete() {
                System.out.println("Observer 2. Completado ");
            }
        });


    }
}