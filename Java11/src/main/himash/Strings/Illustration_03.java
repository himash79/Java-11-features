package main.himash.Strings;

import java.util.logging.Logger;

public class Illustration_03 {

    public static void main(String[] args) {

        Logger log = Logger.getLogger(Illustration_01.class.getName());

        String value = " JD ";
        log.info(value.strip());
        log.info("String length 1 : " + String.valueOf(value.strip().length()));
        log.info(value.stripLeading());
        log.info("String length 2 : " + String.valueOf(value.stripLeading().length()));
        log.info(value.stripTrailing());
        log.info("String length 3 : " + String.valueOf(value.stripTrailing().length()));

    }

}
