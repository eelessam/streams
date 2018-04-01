package com.eelessam.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static com.eelessam.java8exercises.streams.FilterCollection.transform;
import static org.assertj.core.api.Assertions.assertThat;

/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionSpec {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }
}

