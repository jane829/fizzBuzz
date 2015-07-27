package org.github.jane829.fizzbuzz.rule;

public abstract class Rule
{
    public abstract boolean isApplicable(String input);

    public abstract String getResult();
}
