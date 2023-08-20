package item6;

public class Main {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        long start = System.currentTimeMillis();

        //long sum = Calculator.sum();
        long sum = Calculator.sum2();
        System.out.println("sum: " + sum);

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start));
    }
}
