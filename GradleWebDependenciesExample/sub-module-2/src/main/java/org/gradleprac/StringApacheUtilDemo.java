package org.gradleprac;

import org.apache.commons.lang3.ArrayUtils;

public class StringApacheUtilDemo {
//    private static final Logger logger = LoggerFactory.getLogger(StringApacheUtilDemo.class);
    public static void main(String[] args) {
        String[][] array = {{"1", "one", }, {"2", "two", }, {"3", "three"}};
        System.out.println(ArrayUtils.toMap(array).get("1"));

    }
}
