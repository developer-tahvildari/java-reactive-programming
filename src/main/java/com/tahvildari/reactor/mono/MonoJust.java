package com.tahvildari.reactor.mono;

import reactor.core.publisher.Mono;

/**
 * Created by Abdolrahim Tahvildari on 1/17/2023
 */
public class MonoJust {
    public static void main(String[] args) {
        //publisher
        Mono<Integer> mono = Mono.just(1);

        System.out.println("mono = " + mono);
        
        mono.subscribe(i -> System.out.println("i = " + i));
    }
}
