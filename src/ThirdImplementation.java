public class ThirdImplementation implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        int[] array = createArrayWithNumbers(from, to);

        for (int number : array)
            FizzBuzzChecker.checkDivisibility(number);
    }

    private int[] createArrayWithNumbers(int from, int to) {
        int[] array = new int[to + 1];
        for (int i = 0; i <= to; i++) {
            array[i] = from;
            from++;
        }
        return array;
    }
}
