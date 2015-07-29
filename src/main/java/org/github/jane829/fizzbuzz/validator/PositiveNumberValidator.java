package org.github.jane829.fizzbuzz.validator;

import org.github.jane829.fizzbuzz.exception.NumberInvalidException;
import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;
import org.github.jane829.fizzbuzz.exception.NumberNotBiggerThanZeroException;
import org.springframework.stereotype.Component;

import static java.lang.Integer.parseInt;


@Component
public class PositiveNumberValidator extends NumberValidator
{
    @Override
    public void validate(String input) throws NumberInvalidException
    {
        try {
            if (parseInt(input) <= 0) {
                throw new NumberNotBiggerThanZeroException("number should be bigger than 0");
            }
        } catch (NumberFormatException e) {
            throw new NumberIsNotDigitalException("Input should be digital number");
        }
    }
}
