package fizzBuzz;

class Utils {
    static void output(int n) {
        if (n % 3 == 0 && n % 5 == 0) System.out.println(n + " - FizzBuzz");
        if (n % 3 == 0 && n % 5 != 0) System.out.println(n + " - Fizz");
        if (n % 3 != 0 && n % 5 == 0) System.out.println(n + " - Buzz");
    }
}
