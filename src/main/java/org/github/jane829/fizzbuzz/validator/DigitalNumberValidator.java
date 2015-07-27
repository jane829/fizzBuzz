package org.github.jane829.fizzbuzz.validator;

import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;

import static java.lang.Integer.parseInt;


public class DigitalNumberValidator extends NumberValidator
{
    @Override
    public void validate(String input) throws NumberIsNotDigitalException
    {
        if (parseInt(input) > 100) {
//            throw Nu
        }
    }
}
