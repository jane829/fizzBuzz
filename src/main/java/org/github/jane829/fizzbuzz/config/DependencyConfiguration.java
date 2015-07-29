package org.github.jane829.fizzbuzz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.github.jane829.fizzbuzz")
public class DependencyConfiguration
{

//    @Bean
//    public ApplicationRunner applicationRunner(InputValidator inputValidator, AnswerGenerator answerGenerator)
//    {
//        return new ApplicationRunner(inputValidator, answerGenerator);
//    }
//
//
//    @Bean
//    public NumberValidator positiveNumberValidator()
//    {
//        return new PositiveNumberValidator();
//    }
//
//    @Bean
//    public NumberValidator lessThanHundredPositiveNumberValidator()
//    {
//        return new LessThanHundredPositiveNumberValidator();
//    }
//
//    @Bean
//    public FizzRule fizzRule()
//    {
//        return new FizzRule();
//    }
//
//    @Bean
//    public BuzzRule buzzRule()
//    {
//        return new BuzzRule();
//    }
//
//    @Bean
//    public FizzBuzzRule fizzBuzzRule()
//    {
//        return new FizzBuzzRule();
//    }
//
//
//    @Bean
//    public AnswerGenerator answerGenerator(List<Rule> rules)
//    {
//        return new AnswerGenerator(rules);
//    }
//
//    @Bean
//    public InputValidator inputValidator(List<NumberValidator> numberValidators)
//    {
//        return new InputValidator(numberValidators);
//    }


}
