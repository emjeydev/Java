package concurrency;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: DownloadFileTask.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev


public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }



/*

    // Pausing a thread
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
*/

/*

    // Interrupting a thread
    @Override
    public void run() {
        System.out.println("Downloading file... :" + Thread.currentThread().getName());

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            System.out.println("Downloading Byte " + i);
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

*/

/*
    // Race Condition
    @Override
    public void run() {
        System.out.println("Downloading file... :" + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalByte();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
 */

    // Volatile Usage
    @Override
    public void run() {
        System.out.println("Downloading file... :" + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalByte();
        }

        status.done();

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }


}
