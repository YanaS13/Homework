package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class MapTostr {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("-importkeystore", "true");
        map1.put("-srckeystore", "kafka.jks");
        map1.put("-destkeystore", "kafka.p12");
        map1.put("-deststoretype", "PKCS12");

        String s = map1.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }
}
