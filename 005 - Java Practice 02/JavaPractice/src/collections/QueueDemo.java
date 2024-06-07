package collections;

import java.util.ArrayDeque;
import java.util.Queue;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: QueueDemo.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

public class QueueDemo {
    public static void queueUsage() {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        // d -> b -> a -> c

        var front = queue.peek();  // return null if empty
//        var front = queue.element();  // Exception if empty
        System.out.println(front);
        System.out.println(queue);
        var deleteFront = queue.remove();  // Exception if empty
//        var deleteFront = queue.poll();  // return null if empty
        System.out.println(deleteFront);
        System.out.println(queue);
    }
}
