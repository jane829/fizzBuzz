package org.github.jane829.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest
{

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception
    {

        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_1_if_input1()
    {
        // given
        int input = 1;

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_2_if_input2()
    {
        // given
        int input = 2;

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("2"));
    }

    @Test
    public void should_return_fizz_if_input3()
    {

        // given
        int input = 3;

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_if_input6()
    {
        //given
        int input = 6;

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_buzz_if_input5()
    {
        int input = 5;

        String result = fizzBuzz.handle(input);

        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_buzz_if_input10()
    {
        int input = 10;

        String result = fizzBuzz.handle(input);

        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input15()
    {
        int input = 15;

        String result = fizzBuzz.handle(input);

        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input30()
    {
        int input = 30;

        String result = fizzBuzz.handle(input);

        assertThat(result, is("FizzBuzz"));
    }

}
