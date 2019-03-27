import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        FizzBuzz forLoop = (int from, int to) -> {
            System.out.println("For loop:");
            for (int i = from; i <= to; i++) {
                checkFizzBuzzAndPrintMessage(i);
            }
        };

        forLoop.print(0, 15);

        FizzBuzz streams = (int from, int to) -> {
            System.out.println("Streams:");
            IntStream.
                    iterate(from, i -> i + 1).
                    limit(to + 1).
                    forEach(i -> checkFizzBuzzAndPrintMessage(i));
        };

        streams.print(0, 15);

        FizzBuzz forEachLoop =(int from, int to) -> {
            System.out.println("For each:");

            // Tutaj chyba występuje autoboxing inta do Integera przy przekazywaniu do metody checkFizzBuzzAndPrintMessage, ale nie jestem pewny.
            for(Integer i : IntStream.rangeClosed(from, to).boxed().collect(Collectors.toList())) {
                checkFizzBuzzAndPrintMessage(i);
            }
        };

        forEachLoop.print(0, 15);
    }

    private static void checkFizzBuzzAndPrintMessage(int value) {
        if (value % 15 == 0)
            System.out.println(String.format("%d - FizzBuzz", value));
        else if (value % 5 == 0)
            System.out.println(String.format("%d - Buzz", value));
        else if (value % 3 == 0)
            System.out.println(String.format("%d - Fizz", value));
    }
}
