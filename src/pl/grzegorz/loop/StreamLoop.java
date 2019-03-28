package pl.grzegorz.loop;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// print "Fizz, Buzz, FizzBuzz" using features of Java8
public class StreamLoop implements FizzBuzz {


    @Override
    public void print(int from, int to) {

        int[] tab = IntStream.rangeClosed(from, to).toArray();

        List<String> list = Arrays.stream(tab).
                mapToObj(operand -> {

                    String text = "";
                    if (operand % 3 == 0 & operand % 5 == 0) {
                        text = operand + " - FizzBuzz";
                    } else if (operand % 3 == 0) {
                        text = operand + " - Fizz";
                    } else if (operand % 5 == 0) {
                        text = operand + " - Buzz";
                    }
                    return text;
                })
                .filter(s -> !s.equals(""))
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }


}
