package org.github.jane829.fizzbuzz.validator;


import org.github.jane829.fizzbuzz.exception.NumberInvalidException;

public abstract class NumberValidator
{
    public abstract void validate(String input) throws NumberInvalidException;
}
