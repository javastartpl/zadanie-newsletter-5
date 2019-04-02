package pl.lewan;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzzImpl implements FizzBuzz {

    @Override
    public void print1(int from, int to) throws BadRangeException {
        checkRange(from,to);
        for (int i = from; i <=to ; i++) {
            printFizzBuzz(i);
        }
    }

    @Override
    public void print2(int from, int to) throws BadRangeException {
        checkRange(from,to);
        IntStream.range(from,to+1)
                .mapToObj(i -> String.valueOf(i)+" - "+ (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0? "Buzz" : ""))
                .filter(i->i.contains("Fizz")||i.contains("Buzz"))
                .forEach(System.out::println);
    }

    @Override
    public void print3(int from, int to) throws BadRangeException {
        checkRange(from,to);
        ArrayList<Integer> arrayInRange = createArrayInRange(from,to);

        arrayInRange.forEach(FizzBuzzImpl::printFizzBuzz);

    }

    private static void printFizzBuzz(Integer i) {
        if ((i % 5) == 0 && (i % 3) == 0) {
            System.out.println(i + " - FizzBuzz");
        } else if ((i % 3) == 0) {
            System.out.println(i + " - Fizz");
        } else if ((i % 5) == 0) {
            System.out.println(i + " - Buzz");
        }
    }
    private ArrayList<Integer> createArrayInRange(int from, int to){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = from; i <=to ; i++) {
                arrayList.add(i);
        }
        return arrayList;
    }

    private static void checkRange(int from, int to) throws BadRangeException {
        if(from>to){
            throw new BadRangeException("Bad from & to params");

        }
    }
}
