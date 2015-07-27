package org.github.jane829.fizzbuzz.exception;

public class NumberInvalidException extends Throwable
{
    public NumberInvalidException()
    {
        super();
    }

    public NumberInvalidException(String msg)
    {
        super(msg);
    }
}
