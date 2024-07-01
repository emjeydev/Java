package concurrency;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: DownloadStatus.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalByte;
    private Lock lock = new ReentrantLock();

    public int getTotalByte() {
        return totalByte;
    }

    public void incrementTotalByte() {
        lock.lock();
        try {
            totalByte++;
        } finally {
            lock.unlock();
        }
    }
}
