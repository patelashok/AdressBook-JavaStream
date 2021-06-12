package com.adressbook;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook3 {
    public static void main(String[] args) {
        //returns a list view
        List<String> stringlist = Arrays.asList("Ashok", "Anuj",
                "Shubham", "Divya", "Norat");

        List<String> sortedList = stringlist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
