package fizzBuzz;

import printers.Printer;

public class FizzBuzz implements Printer {
    private final int n;
    private String result;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public String getResult() {
        return result;
    }

    @Override
    public void print() {

        /**
         * Given number n print the following:
         * Fizz if n is divisible by 3
         * Buzz if n is divisible by 5
         * fizzBuzz.FizzBuzz if n is divisible by 3 and 5
         */

        if (n % 15 == 0) {
            this.result = "FizzBuzz";
            System.out.println(result);
            return;
        }
        if (n % 3 == 0) {
            this.result = "Fizz";
            System.out.println(result);
            return;
        }
        if (n % 5 == 0) {
            this.result = "Buzz";
            System.out.println(result);
            return;
        }
        this.result = String.format("%s %d %s", "Your number", n, "is no divisible by 3 or 5");
        System.out.println(result);
    }
}
