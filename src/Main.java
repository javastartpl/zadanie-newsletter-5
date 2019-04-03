public class Main {
    public static void main(String[] args) {
        FirstImplementation firstImplementation = new FirstImplementation();
        SecondImplementation secondImplementation = new SecondImplementation();
        ThirdImplementation thirdImplementation = new ThirdImplementation();

        firstImplementation.print(0, 15);
        System.out.println();
        secondImplementation.print(0, 15);
        System.out.println();
        thirdImplementation.print(0, 15);
    }
}
