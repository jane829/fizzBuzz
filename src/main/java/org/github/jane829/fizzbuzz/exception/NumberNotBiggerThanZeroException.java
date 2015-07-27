package org.github.jane829.fizzbuzz.exception;

public class NumberNotBiggerThanZeroException extends NumberInvalidException
{
    public NumberNotBiggerThanZeroException() {
        super();
    }

    public NumberNotBiggerThanZeroException(String msg) {
        super(msg);
    }
}
