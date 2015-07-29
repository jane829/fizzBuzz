package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner
{

    private final InputValidator inputValidator;
    private final AnswerGenerator answerGenerator;

    @Autowired
    public ApplicationRunner(InputValidator inputValidator, AnswerGenerator answerGenerator)
    {
        this.inputValidator = inputValidator;
        this.answerGenerator = answerGenerator;
    }

    public String handle(String input) throws NumberInvalidException
    {
        inputValidator.validate(input);
        return answerGenerator.getAnswer(input);
    }

}
