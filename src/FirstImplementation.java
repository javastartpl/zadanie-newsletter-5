public class FirstImplementation implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        while (from <= to) {
            FizzBuzzChecker.checkDivisibility(from);
            from += 1;
        }
    }
}
