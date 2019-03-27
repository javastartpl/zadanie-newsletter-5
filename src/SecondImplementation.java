import java.util.stream.IntStream;

public class SecondImplementation implements FizzBuzz {
    public static void main(String[] args) {
        SecondImplementation secondImplementation = new SecondImplementation();
        secondImplementation.print(0, 15);
    }

    @Override
    public void print(int from, int to) {
        IntStream.rangeClosed(from, to).forEach(this::checkDivisibility);
    }

    private void checkDivisibility(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println(number + " - FizzBuzz");
        else if (number % 5 == 0)
            System.out.println(number + " - Buzz");
        else if (number % 3 == 0)
            System.out.println(number + " - Fizz");
    }
}
