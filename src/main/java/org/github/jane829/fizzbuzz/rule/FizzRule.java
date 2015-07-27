package org.github.jane829.fizzbuzz.rule;

public class FizzRule extends Rule
{
    public static final int FIZZ_FACTOR = 3;
    private static final String FIZZ = "Fizz";

    @Override
    public String getResult()
    {
        return FIZZ;
    }

    @Override
    public boolean isApplicable(String input)
    {
        return Integer.parseInt(input) % FIZZ_FACTOR == 0;
    }
}