package org.github.jane829.fizzbuzz;

public class BuzzRule extends Rule
{
    public static final int BUZZ_FACTOR = 5;
    private static final String BUZZ = "Buzz";

    @Override
    public String getResult()
    {
        return BUZZ;
    }

    @Override
    public boolean isApplicable(int input)
    {
        return input % BUZZ_FACTOR == 0;
    }
}