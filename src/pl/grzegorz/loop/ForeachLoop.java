package pl.grzegorz.loop;

import java.util.stream.IntStream;


// print "Fizz, Buzz, FizzBuzz" using forEach loop
public class ForeachLoop implements FizzBuzz {

    @Override
    public void print(int from, int to) {

        int[] array = IntStream.rangeClosed(from, to).toArray();

        for (Integer integer : array) {
            if (integer % 3 == 0 & integer % 5 == 0) {
                System.out.println(integer + " - FizzBuzz");
            } else if (integer % 3 == 0) {
                System.out.println(integer + " - Fizz");
            } else if (integer % 5 == 0) {
                System.out.println(integer + " - Buzz");
            }
        }

    }

}
