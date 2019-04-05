package fizzBuzz;

import java.util.Scanner;

public class App {

    private static final int CLASSIC_LOOP = 1;
    private static final int STREAMS = 2;
    private static final int FOREACH = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek ciągu liczb całkowitych:");
        int from = scanner.nextInt();
        int to;
        do {
            System.out.println("Podaj ostatnią liczbę ciagu liczb całkowitych, liczba nie moze byc mniejsza lub równa pierwszej:");
            to = scanner.nextInt();
        }
        while(to<=from);

        selectMethodInfo();

        int selectedMethod = scanner.nextInt();

        executeFizzBuzz(from, to, selectedMethod);
    }

    private static void executeFizzBuzz(int from, int to, int selectedMethod) {
        FizzBuzz fizzBuzz = null;
        switch (selectedMethod) {
            case 1: {
                fizzBuzz = new ClassicFizzBuzz();
                break;
            }
            case 2: {
                fizzBuzz = new StreamFizzBuzz();
                break;
            }
            case 3: {
                fizzBuzz = new ForEachFizzBuzz();
                break;
            }
            default:
                System.out.println("Nie wybrano właściwej opcji");
        }
        if (fizzBuzz != null) {
            fizzBuzz.print(from, to);
        }
    }

    private static void selectMethodInfo() {
        System.out.println("Krórej metody chcesz użyć do obliczeń:");
        System.out.println(CLASSIC_LOOP + " - klasyczne uzycie pętli");
        System.out.println(STREAMS + " - metoda z zastosowaniem stream");
        System.out.println(FOREACH + " - metoda z zastosowaniem pętli for each");
    }
}
