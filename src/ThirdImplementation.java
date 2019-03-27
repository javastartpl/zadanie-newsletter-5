public class ThirdImplementation implements FizzBuzz {
    public static void main(String[] args) {
        ThirdImplementation thirdImplementation = new ThirdImplementation();
        thirdImplementation.print(0, 15);
    }

    @Override
    public void print(int from, int to) {
        int[] array = createArrayWithNumbers(from, to);

        for (int number : array) {
            if (number % 3 == 0 && number % 5 == 0)
                System.out.println(number + " - FizzBuzz");
            else if (number % 5 == 0)
                System.out.println(number + " - Buzz");
            else if (number % 3 == 0)
                System.out.println(number + " - Fizz");
        }
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
