package org.github.jane829.fizzbuzz.exception;

public class NumberIsNotDigitalException extends NumberInvalidException
{
    public NumberIsNotDigitalException() {
        super();
    }

    public NumberIsNotDigitalException(String msg) {
        super(msg);
    }
}
