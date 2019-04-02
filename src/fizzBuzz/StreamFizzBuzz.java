package fizzBuzz;

import java.util.stream.IntStream;

public class StreamFizzBuzz implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        IntStream ints = IntStream.rangeClosed(from, to);
        ints.filter(n -> n % 3 == 0 || n % 5 == 0).forEach(Utils::output);
    }
}
