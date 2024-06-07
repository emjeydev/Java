package collections;

import java.util.*;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: SetDemo.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev


public class SetDemo {
    public static void setUsage() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        // delete duplicate in a collection using sets

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> collectionSet = new HashSet<>(collection);
        System.out.println(collectionSet);

        // set operations

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

      /*  // Union
        set1.addAll(set2);
        System.out.println(set1); */

       /* // Intersection
        set1.retainAll(set2);
        System.out.println(set1); */

        // Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
