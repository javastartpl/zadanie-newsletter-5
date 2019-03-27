package pack;

import java.util.stream.IntStream;


public class Main implements FizzBuzz{
	
	public static void main(String[] args) {
		Main main = new Main();
		main.print(0, 15);
	}
	
	/*@Override
	public void print(int from, int to) {
		for (int i = from; i <= to; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("" + i + " - " + "FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("" + i + " - " + "Fizz");
			} else if (i % 5 == 0) {
				System.out.println("" + i + " - " + "Buzz");
			}
		}
	}*/

	/*@Override
	public void print(int from, int to) {
		IntStream.range(from, to).forEach(i -> {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("" + i + " - " + "FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("" + i + " - " + "Fizz");
			} else if (i % 5 == 0) {
				System.out.println("" + i + " - " + "Buzz");
			}
		});
	}*/
	
	@Override
	public void print(int from, int to) {
		for (int i : IntStream.rangeClosed(from, to).toArray())
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("" + i + " - " + "FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("" + i + " - " + "Fizz");
			} else if (i % 5 == 0) {
				System.out.println("" + i + " - " + "Buzz");
			}
	};
}
