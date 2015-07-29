package org.github.jane829.fizzbuzz.rule;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzRule extends Rule
{
    private static final String FIZZ_BUZZ = "FizzBuzz";

    @Override
    public String getResult()
    {
        return FIZZ_BUZZ;
    }

    @Override
    public boolean isApplicable(String input)
    {
        return Integer.parseInt(input) % FizzRule.FIZZ_FACTOR == 0 && Integer.parseInt(input) % BuzzRule.BUZZ_FACTOR == 0;
    }
}