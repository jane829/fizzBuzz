package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberInvalidException;
import org.github.jane829.fizzbuzz.validator.NumberValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InputValidator
{
    private final List<NumberValidator> handlers;

    @Autowired
    public InputValidator(List<NumberValidator> handlers)
    {
        this.handlers = handlers;
    }

    public void validate(String input) throws NumberInvalidException
    {
        for (NumberValidator numberValidator : handlers) {
            numberValidator.validate(input);
        }
    }
}