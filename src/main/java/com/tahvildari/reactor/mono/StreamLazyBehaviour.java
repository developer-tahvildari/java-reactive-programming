package com.tahvildari.reactor.mono;

import java.util.stream.Stream;

/**
 * Created by Abdolrahim Tahvildari on 1/16/2023
 */
public class StreamLazyBehaviour {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1)
                .map(i ->
                {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                });
        //System.out.println("integerStream = " + integerStream);
        integerStream.forEach(System.out::println);

    }

}
