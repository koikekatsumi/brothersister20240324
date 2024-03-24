package com.koike;

import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        List<String> names = List.of("mai", "azusa", "taikai", "arisa");
        List<String> result = names.stream().filter(name -> name.contains("i")).collect(Collectors.toList());
        System.out.println(result);

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}