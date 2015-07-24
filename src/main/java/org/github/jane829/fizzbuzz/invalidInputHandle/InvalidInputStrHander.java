package org.github.jane829.fizzbuzz.invalidInputHandle;

import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;

import java.util.regex.Pattern;

public class InvalidInputStrHander extends InValidInputHandler
{
    @Override
    public void handleInvalidInput(String input) throws NumberIsNotDigitalException
    {

        Pattern pattern = Pattern.compile("[0-9]*");

        if (!pattern.matcher(input).matches() && !input.startsWith("-")) {

            throw new NumberIsNotDigitalException("number should be digtal");

        }



    }
}
