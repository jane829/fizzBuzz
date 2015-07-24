package org.github.jane829.fizzbuzz;

import org.github.jane829.fizzbuzz.exception.NumberIsNotDigitalException;
import org.github.jane829.fizzbuzz.exception.NumberNotBiggerThanZeroException;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static junit.framework.TestCase.fail;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest
{

    private FizzBuzz fizzBuzz;
    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception
    {

        this.fizzBuzz = new FizzBuzz(Arrays.asList(new FizzBuzzRule(), new BuzzRule(), new FizzRule()));
    }

    @Test
    public void should_return_1_if_input1() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        // given
        String input = "1";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_2_if_input2() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        // given
        String input = "2";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("2"));
    }

    @Test
    public void should_return_fizz_if_input3() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {

        // given
        String input = "3";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_if_input6() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        //given
        String input = "6";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_buzz_if_input5() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        // given
        String input = "5";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_buzz_if_input10() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        // given
        String input = "10";

        // when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input15() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        //given
        String input = "15";

        //when
        String result = fizzBuzz.handle(input);

        // then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_input30() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        // given
        String input = "30";

        // when
        String result = fizzBuzz.handle(input);

        // then 
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_throw_exception_if_input_is_0() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {

        thrown.expect(NumberNotBiggerThanZeroException.class);

        // when
        fizzBuzz.handle("0");

    }

    @Test
    public void should_throw_exception_if_input_is_smaller_than_0() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        thrown.expect(NumberNotBiggerThanZeroException.class);

        // when
        fizzBuzz.handle("-1");

    }

    @Test
    public void should_throw_exception_if_input_is_not_digtal() throws NumberNotBiggerThanZeroException, NumberIsNotDigitalException
    {
        thrown.expect(NumberIsNotDigitalException.class);

        // when
        fizzBuzz.handle("a");
    }
}
