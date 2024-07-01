package concurrency;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ThreadDemo.java
// Date: 2024/06/22
// Modified Date: 2024/06/24
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ThreadDemo {

    public static void createThreadUsage() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
