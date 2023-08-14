package main.himash.Strings;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Illustration_02 {

    public static void main(String[] args) {

        Logger log = Logger.getLogger(Illustration_01.class.getName());

        String valueList = "JD\nJD\nJD";
        List<String> list = valueList.lines().collect(Collectors.toList());
        log.info(String.valueOf(list));

    }

}
