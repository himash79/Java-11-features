package main.himash.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Illustration_01 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("January","February","March");

        List<String> conList = list.stream().map((var month) -> month.toUpperCase()).collect(Collectors.toList());

        System.out.println(conList);

    }

}
