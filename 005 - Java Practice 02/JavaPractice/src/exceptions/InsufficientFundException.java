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
public class InsufficientFundException extends Exception{

    public InsufficientFundException() {
        super("Insufficeint funds in your account.");
    }

    public InsufficientFundException(String message) {
        super(message);
    }
}
