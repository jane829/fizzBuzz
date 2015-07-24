package org.github.jane829.fizzbuzz;

import java.util.List;

public class FizzBuzz
{

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules)
    {
        this.rules = rules;
    }

    public String handle(int input)
    {
        String result = String.valueOf(input);

        for (Rule rule : rules) {
            if(rule.isApplicable(input)){
                return rule.getResult();
            }
        }

        return result;
    }

}
