package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: CollectionDemo.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

public class CollectionDemo {
    public static void collectionUsage() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Collections.addAll(collection, "d", "e", "f", "g");
        collection.remove("a");
//        collection.clear(); -> delete all items
        var containsA = collection.contains("a");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(containsA);

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
    }
}
