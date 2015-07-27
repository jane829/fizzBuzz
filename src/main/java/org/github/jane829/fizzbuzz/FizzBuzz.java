package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.validator.NumberValidator;

import java.util.List;

public class FizzBuzz
{

    private List<Rule> rules;

    private List<NumberValidator> handlers;

    public FizzBuzz(List<Rule> rules, List<NumberValidator> handlers)
    {
        this.rules = rules;
        this.handlers = handlers;
    }

    public String handle(String input) throws Throwable
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

    private void checkIfInputIsIllegal(String input) throws Throwable
    {

        for (NumberValidator numberValidator : handlers) {
            numberValidator.validate(input);
        }
    }


}
