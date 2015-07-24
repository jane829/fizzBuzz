package org.github.jane829.fizzbuzz.invalidInputHandle;

import org.github.jane829.fizzbuzz.exception.NumberNotBiggerThanZeroException;

import java.util.regex.Pattern;


public class InValidInputDigtalHanlder extends InValidInputHandler
{
    @Override
    public void handleInvalidInput(String input) throws Throwable
    {
        if(isInvalidDigtalLessThanZero(input)){
            throw new NumberNotBiggerThanZeroException("number should be bigger than 0");
        }
    }

    private boolean isInvalidDigtalLessThanZero(String input)
    {
        Pattern pattern = Pattern.compile("[0-9]*");

        String temp;

        temp = input.startsWith("-") ? input.substring(1) : input;

        return (pattern.matcher(temp).matches()&&Integer.valueOf(temp) == 0) || (pattern.matcher(temp).matches() &&  input.startsWith("-"));
    }
}
