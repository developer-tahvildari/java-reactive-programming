package com.tahvildari.reactor.mono;

import com.tahvildari.reactor.util.Util;
import reactor.core.publisher.Mono;

/**
 * Created by Abdolrahim Tahvildari on 1/23/2023
 */
public class MonoSubscribe {

    public static void main(String[] args) {

        //publisher
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(l -> l /2);

        //1
        // mono.subscribe();

        mono.subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }
}
