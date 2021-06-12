package com.adressbook;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook4 {
    public static void main(String[] args)
    {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ashok", "Anuj",
                "Shubham", "Divya","Norat");
        // counting number of strings in stream
        long count_string =  stream.collect(Collectors.counting());

        System.out.println(count_string);


    }
}
