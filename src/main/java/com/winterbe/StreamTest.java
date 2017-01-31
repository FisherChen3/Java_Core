package com.winterbe;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Fisher on 1/18/2017.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        // static method reference
        stringCollection.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);


//        stringCollection.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);

//        System.out.println("stringCollection = " + stringCollection);
        // map is like the map operation in mapReduce
//        stringCollection.stream().map(String::toUpperCase).forEach(System.out::println);


        boolean startWithA = stringCollection.stream().anyMatch((a)->a.startsWith("a"));
        System.out.println(startWithA);

        Optional<String> reduced = stringCollection.stream().reduce((a,b)->a+"#"+b);
        reduced.ifPresent(System.out::println);



    }
}
