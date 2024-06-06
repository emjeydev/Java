package exceptions;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: InsufficientFundException.java
// Date: 2024/06/06
// Modified Date: 2024/06/06
// Email: emjeydev@gmail.com
// Github: emjeydev


/*
    checked => extends Exception
    unchecked => extends RuntimeException
*/

public class AccountException extends Exception {

    public AccountException(Exception cause) {
        super(cause);
    }
}
