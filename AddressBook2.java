package com.adressbook;

import java.util.stream.Stream;

public class AddressBook2 {
    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ashok", "Anuj",
                "Shubham", "Divya", "Norat");
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with a
        stream.filter(str -> str.endsWith("a"))
                .forEach(System.out::println);
    }
}
