package com.tahvildari.reactor.util;

import java.util.function.Consumer;

/**
 * Created by Abdolrahim Tahvildari on 1/23/2023
 */
public class Util {

    public static Consumer<Object> onNext() {
        return o -> System.out.println("Received = " + o);
    }

    public static Consumer<Throwable> onError() {
        return e -> System.out.println("Error" + e.getMessage());
    }

    public static Runnable onComplete() {
        return () -> System.out.println("Completed");
    }
}
