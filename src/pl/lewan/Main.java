package pl.lewan;

public class Main {


    public static void main(String[] args) throws BadRangeException {
        FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();
        int from = 0;
        int to = 15;

        System.out.println("\n1st implementation\n");
        fizzBuzz.print1(from,to);
        System.out.println("\n2nd implementation\n");
        fizzBuzz.print2(from,to);
        System.out.println("\n3rd implementation\n");
        fizzBuzz.print3(from,to);

    }
}
