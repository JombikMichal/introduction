public class FizzBuzz implements Printer{
    private final int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public void print() {

        /**
         * Given number n print the following:
         * Fizz if n is divisible by 3
         * Buzz if n is divisible by 5
         * FizzBuzz if n is divisible by 3 and 5
         */

        if (n % 15 == 0) {
            System.out.println("FizzBuzz");
            System.out.println();
            System.out.println();
            return;
        }
        if (n % 3 == 0) {
            System.out.println("Fizz");
            System.out.println();
            System.out.println();
            return;
        }
        if (n % 5 == 0) {
            System.out.println("Buzz");
            System.out.println();
            System.out.println();
            return;
        }
    }
}
