package main.himash.Strings;

import java.util.logging.Logger;

public class Illustration_04 {

    public static void main(String[] args) {

        Logger log = Logger.getLogger(Illustration_01.class.getName());

        String value = "Hello my world";
        log.info(value.concat(" ").repeat(2));

    }

}
