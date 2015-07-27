package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.rule.Rule;

import java.util.List;

public class AnswerGenerator
{
    private List<Rule> rules;

    public AnswerGenerator(List<Rule> rules)
    {
        this.rules = rules;
    }

    String getAnswer(String input)
    {
        for (Rule rule : this.rules) {
            if (rule.isApplicable(input)) {
                return rule.getResult();
            }
        }
        return input;
    }
}