import java.util.stream.IntStream;

public class SecondImplementation implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        IntStream.rangeClosed(from, to)
                .forEach(FizzBuzzChecker::checkDivisibility);
    }
}
