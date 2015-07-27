package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.validator.NumberValidator;

import java.util.List;

public class InputValidator
{
    private final List<NumberValidator> handlers;

    public InputValidator(List<NumberValidator> handlers)
    {
        this.handlers = handlers;
    }

    void validate(String input) throws Throwable
    {
        for (NumberValidator numberValidator : handlers) {
            numberValidator.validate(input);
        }
    }
}