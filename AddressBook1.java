package com.adressbook;

import java.util.stream.Stream;

public class AddressBook1 {
    public static void main(String[] args)
    {

        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ashok", "Anuj",
                "Shubham", "Divya","Norat");

        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements Start with A
        stream.filter(str -> str.startsWith("A"))
                .forEach(System.out::println);

    }
    }
