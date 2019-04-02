package fizzBuzz;

public class ClassicFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        int i = from;
        while (i <= to) {
            if (i % 3 == 0 || i % 5 == 0) {
                Utils.output(i);
            }
            i++;
        }
    }
}
