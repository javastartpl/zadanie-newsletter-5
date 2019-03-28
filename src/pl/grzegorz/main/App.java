package pl.grzegorz.main;

import pl.grzegorz.loop.ClassicLoop;
import pl.grzegorz.loop.FizzBuzz;
import pl.grzegorz.loop.ForeachLoop;
import pl.grzegorz.loop.StreamLoop;

import java.util.Scanner;

 class App {

    private Scanner scanner;

     App(){
        this.scanner = new Scanner(System.in);
    }

    private  void printOptions() {
        System.out.println("-------------------------------");
        System.out.println("Choose implementation :");
        System.out.println("1 - classic loop");
        System.out.println("2 - stream java8");
        System.out.println("3 - forEach loop");
        System.out.println("4 - exit");
    }

    private  int getStartParameter(Scanner scanner) {
        int from;
        System.out.println("start loop");
        from = scanner.nextInt();
        return from;
    }

    private  int getEndParameter(Scanner scanner) {
        int to;
        System.out.println("end loop");
        to = scanner.nextInt();
        return to;
    }

    private  void chooseOption(int option) {
        FizzBuzz fizzBuzz;
        int from;
        int to;
        switch (option) {
            case 1: {
                fizzBuzz = new ClassicLoop();
                from = getStartParameter(scanner);
                to = getEndParameter(scanner);
                executeOption(fizzBuzz, from, to);
                break;
            }
            case 2: {
                fizzBuzz = new StreamLoop();
                from = getStartParameter(scanner);
                to = getEndParameter(scanner);
                executeOption(fizzBuzz, from, to);
                break;
            }
            case 3: {
                fizzBuzz = new ForeachLoop();
                from = getStartParameter(scanner);
                to = getEndParameter(scanner);
                executeOption(fizzBuzz, from, to);
                break;
            }
            case 4: {
                System.out.println("Exit");
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + option);
            }

        }
    }
     private  void executeOption(FizzBuzz fizzBuzz, int from, int to) {
         fizzBuzz.print(from, to);
     }

      void mainLoop() {
        int option;
        do {
            printOptions();
            option = scanner.nextInt();
            chooseOption(option);

        } while (option != 4);
    }
}
