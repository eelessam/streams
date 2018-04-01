package com.eelessam.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

    public static List<String> transform(List<String> filterMe) {
        return filterMe.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }
}
