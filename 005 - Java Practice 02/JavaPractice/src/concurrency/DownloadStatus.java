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
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    //    private volatile boolean done;
    private boolean done;
    //    private AtomicInteger totalByte = new AtomicInteger(); // atomic object
    //    private LongAdder totalByte = new LongAdder(); // adder
    private int totalByte;
    //    private Lock lock = new ReentrantLock();
    private final Object totalBytesLock = new Object();

    public int getTotalByte() {
//        return totalByte.get(); // atomic object
//        return totalByte.intValue(); // adder
        return totalByte;
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
//        totalByte.incrementAndGet(); // atomic object
//        totalByte.increment(); // adder
        totalByte++;
    }

    public boolean isDone() {
        return done;
    }

    public void done() {
        this.done = true;
    }
}
