package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ListDemo.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ListDemo {
    public static void listUsage() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        Collections.addAll(list, "d", "e", "f", "g", "a");
        list.set(7, "?");
        list.remove(0);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf("f"));
        System.out.println(list.indexOf("Z"));
        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.subList(0, 2));
    }
}
