package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnswerGenerator
{
    private List<Rule> rules;

    @Autowired
    public AnswerGenerator(List<Rule> rules)
    {
        this.rules = rules;
    }

    public String getAnswer(String input)
    {
        for (Rule rule : this.rules) {
            if (rule.isApplicable(input)) {
                return rule.getResult();
            }
        }
        return input;
    }
}