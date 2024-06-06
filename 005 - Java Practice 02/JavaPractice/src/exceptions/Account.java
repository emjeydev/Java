package exceptions;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: ExceptionDemo.java
// Date: 2024/06/06
// Modified Date: 2024/06/06
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }
}
