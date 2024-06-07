package collections;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: MapDemo.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void mapUsage() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("e1");
        System.out.println(customer);

        var unknown = new Customer("unkown", "");
        var unkownCustomer = map.getOrDefault("e10", unknown);
        System.out.println(unkownCustomer);

        var exists = map.containsKey("e10");
        System.out.println(exists);

        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        for (var key : map.keySet())
            System.out.println("Key: " + key);

        for (var entry : map.entrySet())
            System.out.println(entry);

        for (var value : map.values())
            System.out.println("Value: " + value);

    }

}
