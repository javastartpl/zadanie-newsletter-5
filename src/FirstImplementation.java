public class FirstImplementation implements FizzBuzz {
    public static void main(String[] args) {
        FirstImplementation firstImplementation = new FirstImplementation();
        firstImplementation.print(0, 15);
    }

    @Override
    public void print(int from, int to) {
        while (from <= to) {
            if (from % 3 == 0 && from % 5 == 0)
                System.out.println(from + " - FizzBuzz");
            else if (from % 5 == 0)
                System.out.println(from + " - Buzz");
            else if (from % 3 == 0)
                System.out.println(from + " - Fizz");
            from += 1;
        }
    }
}
