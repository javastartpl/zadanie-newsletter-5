class FizzBuzzChecker {
    static void checkDivisibility(int number) {
        if (number % 15 == 0)
            System.out.println(number + " - FizzBuzz");
        else if (number % 5 == 0)
            System.out.println(number + " - Buzz");
        else if (number % 3 == 0)
            System.out.println(number + " - Fizz");
    }
}
