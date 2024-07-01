package concurrency;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: DownloadStatus.java
// Date: 2024/07/01
// Modified Date: 2024/07/01
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    //    private volatile boolean done;
    private boolean done;
    private AtomicInteger totalByte = new AtomicInteger();
    //    private Lock lock = new ReentrantLock();
    private final Object totalBytesLock = new Object();

    public int getTotalByte() {
        return totalByte.get();
    }

/*
    // lock
    public void incrementTotalByte() {
        lock.lock();
        try {
            totalByte++;
        } finally {
            lock.unlock();
        }
    }
*/

    public void incrementTotalByte() {
//        synchronized (totalBytesLock) {
//            totalByte++;
//        }
        totalByte.incrementAndGet();
    }

    public boolean isDone() {
        return done;
    }

    public void done() {
        this.done = true;
    }
}
