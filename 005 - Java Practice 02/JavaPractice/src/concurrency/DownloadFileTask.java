package concurrency;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: DownloadFileTask.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading file... :" + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
