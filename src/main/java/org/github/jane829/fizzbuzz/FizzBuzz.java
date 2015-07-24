package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;
import org.github.jane829.fizzbuzz.exception.NumberNotBiggerThanZeroException;

import java.util.List;
import java.util.regex.Pattern;

public class FizzBuzz
{

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules)
    {
        this.rules = rules;
    }

    public String handle(String input) throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {


        checkIfInputIsIllegal(input);

        int inputData = Integer.valueOf(input);

        String result = String.valueOf(inputData);

        for (Rule rule : rules) {
            if (rule.isApplicable(inputData)) {
                return rule.getResult();
            }
        }

        return result;
    }

    private void checkIfInputIsIllegal(String input) throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {

        Pattern pattern = Pattern.compile("[0-9]*");
        if (!pattern.matcher(input).matches() && !input.startsWith("-")) {

            throw new NumberIsNotDigitalException("number should be digtal");

        } else {
            if (Integer.valueOf(input) <= 0) {
                throw new NumberNotBiggerThanZeroException("number should be bigger than 0");
            }
        }
    }




}
