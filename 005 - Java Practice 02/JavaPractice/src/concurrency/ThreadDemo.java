package concurrency;

import java.util.*;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ThreadDemo.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev


public class ThreadDemo {

    public static void synchronizedCollectionUsgae() {
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);
    }

    public static void atomicObjectUsage() {
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

    public static void volatileUsage() {
        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalByte());
        });

        thread1.start();
        thread2.start();
    }

    public static void synchronizationUsingLocks() {
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

    public static void confinementSolutionForThread() {

        List<Thread> threadList = new ArrayList<>();
        List<DownloadFileTask> taskList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            taskList.add(task);

            var thread = new Thread(task);
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

        var totalBytes = taskList.stream()
                .map(t -> t.getStatus().getTotalByte())
                .reduce(Integer::sum);

        System.out.println(totalBytes);
    }

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
