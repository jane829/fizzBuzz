package org.github.jane829.fizzbuzz;

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
    public boolean isApplicable(int input)
    {
        return input % FIZZ_FACTOR == 0;
    }
}