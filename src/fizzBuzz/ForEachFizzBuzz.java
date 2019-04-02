package fizzBuzz;

import java.util.Arrays;

public class ForEachFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        int[] array = new int[Math.abs(to - from) + 1];
        Arrays.setAll(array, i -> i + 1);
        for (int i : array) {
            if (i % 3 == 0 || i % 5 == 0) {
                Utils.output(i);
            }
        }
    }
}
