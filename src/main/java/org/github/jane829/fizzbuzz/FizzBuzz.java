package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.invalidInputHandle.InValidInputHandler;

import java.util.List;

public class FizzBuzz
{

    private List<Rule> rules;

    private List<InValidInputHandler> handlers;

    public FizzBuzz(List<Rule> rules, List<InValidInputHandler> handlers)
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

        for(InValidInputHandler invalidInputHandler : handlers) {

            invalidInputHandler.handleInvalidInput(input);
        }
    }




}
