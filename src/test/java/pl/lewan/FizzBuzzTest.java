package test.java.pl.lewan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.lewan.BadRangeException;
import pl.lewan.FizzBuzzImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    String expectedResultFrom0to15="0 - FizzBuzz\n" +
            "3 - Fizz\n" +
            "5 - Buzz\n" +
            "6 - Fizz\n" +
            "9 - Fizz\n" +
            "10 - Buzz\n" +
            "12 - Fizz\n" +
            "15 - FizzBuzz\n";
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void whenFrom0to15Print_1_ShouldPrintValidValue() throws BadRangeException {
        FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();

        fizzBuzz.print1(0,15);
        assertEquals(expectedResultFrom0to15, outContent.toString());
    }

    @Test
    public void whenFrom0to15Print_2_ShouldPrintValidValue() throws BadRangeException {
        FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();
        fizzBuzz.print2(0,15);
        assertEquals(expectedResultFrom0to15, outContent.toString());
    }

    @Test
    public void whenFrom0to15Print_3_ShouldPrintValidValue() throws BadRangeException {
        FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();
        fizzBuzz.print3(0,15);
        assertEquals(expectedResultFrom0to15, outContent.toString());
    }


    @Test(expected = BadRangeException.class)
    public void whenFromBiggerThanToShouldThrowException() throws BadRangeException {
        FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();
        fizzBuzz.print1(100,15);
    }


}