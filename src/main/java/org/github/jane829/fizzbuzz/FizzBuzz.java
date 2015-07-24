package org.github.jane829.fizzbuzz;

public class FizzBuzz
{
    private String result;

    public String handle(int input)
    {
        if (input == 0) {
            throw new IllegalArgumentException();
        }

        result = String.valueOf(input);

        if (isMultipleOfThreeAndFive(input)) {
            result = "FizzBuzz";
        } else if (isMultipleOfThree(input)) {
            result = "Fizz";
        } else if (isMultipleOfFive(input)) {
            result = "Buzz";
        }

        return result;
    }

    private boolean isMultipleOfThreeAndFive(int input)
    {
        return input % 3 == 0 && input % 5 == 0;
    }

    private boolean isMultipleOfFive(int input)
    {
        return input % 5 == 0;
    }

    private boolean isMultipleOfThree(int input)
    {
        return input % 3 == 0;
    }
}
