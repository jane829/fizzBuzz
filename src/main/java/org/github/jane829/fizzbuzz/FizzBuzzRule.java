package org.github.jane829.fizzbuzz;

public class FizzBuzzRule extends Rule
{
    private static final String FIZZ_BUZZ = "FizzBuzz";

    @Override
    public String getResult()
    {
        return FIZZ_BUZZ;
    }

    @Override
    public boolean isApplicable(int input)
    {
        return input % FizzRule.FIZZ_FACTOR == 0 && input % BuzzRule.BUZZ_FACTOR == 0;
    }
}