package main.himash.Strings;

import java.util.logging.Logger;

public class Illustration_01 {

    public static void main(String[] args) {

        Logger log = Logger.getLogger(Illustration_01.class.getName());

        String value_01 = "";
        String value_02 = "             ";
        String value_03 = "Hello my world";

        log.info(String.valueOf(value_01.isBlank()));
        log.info(String.valueOf(value_02.isBlank()));
        log.info(String.valueOf(value_03.isBlank()));

    }

}
