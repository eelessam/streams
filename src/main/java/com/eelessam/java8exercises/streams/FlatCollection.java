package com.eelessam.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {

    public static List<String> transform(List<List<String>> flatMapMe) {
        return flatMapMe.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
