package com.eelessam.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static List<String> transform(List<String> upperCaseMe) {
        return upperCaseMe.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
