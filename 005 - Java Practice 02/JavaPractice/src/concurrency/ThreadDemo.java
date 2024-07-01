package concurrency;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ThreadDemo.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev


public class ThreadDemo {

    public static void raceConditionInThread() {
        var status = new DownloadStatus();

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threadList.add(thread);
        }

        for (var thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalByte());
    }

    public static void interruptThreadUsage() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }

    public static void createThreadUsage() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
