package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberInvalidException;

public class ApplicationRunner
{

    private final InputValidator inputValidator;
    private final AnswerGenerator answerGenerator;

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
