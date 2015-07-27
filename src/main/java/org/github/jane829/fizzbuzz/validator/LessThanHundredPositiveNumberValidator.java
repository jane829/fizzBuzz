package org.github.jane829.fizzbuzz.validator;

import org.github.jane829.fizzbuzz.exception.NumberInvalidException;
import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;
import org.github.jane829.fizzbuzz.exception.NumberShouldSmallerThanHundredException;

import static java.lang.Integer.parseInt;

public class LessThanHundredPositiveNumberValidator extends NumberValidator
{
    @Override
    public void validate(String input) throws NumberInvalidException
    {
        try {
            if (parseInt(input) > 100) {
                throw new NumberShouldSmallerThanHundredException("input should be positive number less than 100");
            }
        } catch (NumberFormatException e) {
            throw new NumberIsNotDigitalException("Input should be digital number");
        }
    }


}
