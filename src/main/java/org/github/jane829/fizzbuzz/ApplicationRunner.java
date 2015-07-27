package org.github.jane829.fizzbuzz;

public class ApplicationRunner
{

    private final InputValidator inputValidator;
    private final AnswerGenerator answerGenerator;

    public ApplicationRunner(InputValidator inputValidator, AnswerGenerator answerGenerator)
    {
        this.inputValidator = inputValidator;
        this.answerGenerator = answerGenerator;
    }

    public String handle(String input) throws Throwable
    {
        inputValidator.validate(input);
        return answerGenerator.getAnswer(input);
    }

}
