package org.example;

import java.util.*;
import java.util.stream.*;
public class StrToMap {
    public static void main(String[] args) {
        String s = " -importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12  -deststoretype PKCS12";
        Map<String, String> stringMap = Arrays.stream(s.split("\s+-"))
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toMap(x -> "-" + x.split("\s+")[0], x -> x.split("\s+")[1]));
        System.out.println(stringMap);
    }
}


