package fizzBuzz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj początek ciągu liczb całkowitych:");
        int from = scanner.nextInt();
        System.out.println("Podaj ostatni liczbę ciagu liczb całkowitych:");
        int to = scanner.nextInt();
        selectMethodInfo();
        int selectedMethod = scanner.nextInt();
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
        System.out.println("1 - klasyczne uzycie pętli");
        System.out.println("2 - metoda z zastosowaniem stream");
        System.out.println("3 - metoda z zastosowaniem pętli for each");
    }
}
