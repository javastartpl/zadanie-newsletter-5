package fizzBuzz;

class Utils {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    static void output(int n) {

        if (n % 15 == 0) System.out.println(n + " - "+FIZZ+BUZZ);
        else if (n % 3 == 0) System.out.println(n + " - "+FIZZ);
        else if (n % 5 == 0) System.out.println(n + " - "+BUZZ);
    }
}
