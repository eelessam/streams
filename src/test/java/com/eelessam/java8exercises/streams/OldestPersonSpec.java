package com.eelessam.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static com.eelessam.java8exercises.streams.OldestPerson.getOldestPerson;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OldestPersonSpec {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

}
