package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;
import org.github.jane829.fizzbuzz.exception.NumberNotBiggerThanZeroException;
import org.github.jane829.fizzbuzz.exception.NumberShouldSmallerThanHundredException;
import org.github.jane829.fizzbuzz.rule.BuzzRule;
import org.github.jane829.fizzbuzz.rule.FizzBuzzRule;
import org.github.jane829.fizzbuzz.rule.FizzRule;
import org.github.jane829.fizzbuzz.validator.LessThanHundredPositiveNumberValidator;
import org.github.jane829.fizzbuzz.validator.PositiveNumberValidator;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationRunnerTest
{

    private ApplicationRunner applicationRunner;
    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp()
    {

        this.applicationRunner = new ApplicationRunner(
                new InputValidator(Arrays.asList(new PositiveNumberValidator(), new LessThanHundredPositiveNumberValidator())),
                new AnswerGenerator(Arrays.asList(new FizzBuzzRule(), new BuzzRule(), new FizzRule())));
    }

    @Test
    public void should_return_1_if_input1() throws Throwable
    {
        // given
        String input = "1";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_2_if_input2() throws Throwable
    {
        // given
        String input = "2";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("2"));
    }

    @Test
    public void should_return_fizz_if_input3() throws Throwable
    {

        // given
        String input = "3";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_if_input6() throws Throwable
    {
        //given
        String input = "6";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_buzz_if_input5() throws Throwable
    {
        // given
        String input = "5";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_buzz_if_input10() throws Throwable
    {
        // given
        String input = "10";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input15() throws Throwable
    {
        //given
        String input = "15";

        //when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input30() throws Throwable
    {
        // given
        String input = "30";

        // when
        String result = applicationRunner.handle(input);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_throw_exception_if_input_is_0() throws Throwable
    {

        thrown.expect(NumberNotBiggerThanZeroException.class);

        // when
        applicationRunner.handle("0");

    }

    @Test
    public void should_throw_exception_if_input_is_smaller_than_0() throws Throwable
    {
        thrown.expect(NumberNotBiggerThanZeroException.class);

        // when
        applicationRunner.handle("-1");

    }

    @Test
    public void should_throw_exception_if_input_is_not_digital() throws Throwable
    {
        thrown.expect(NumberIsNotDigitalException.class);

        // when
        applicationRunner.handle("a");
    }

    @Test
    public void should_throw_input_is_smaller_than_100() throws Throwable
    {
        thrown.expect(NumberShouldSmallerThanHundredException.class);

        //when
        applicationRunner.handle("101");

    }
}
