package fibonacci;

import printers.Printer;

public class Fibonacci implements Printer {
    private final int n;
    private String result;

    public Fibonacci(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Your number is less than zero! Are you kidding me?");
        }
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
         * #8 Print n-th fibonacci.Fibonacci number. Try both approaches. Which one is more efficient?
         * fibonacci.Fibonacci Series of 10 numbers: 0 1 1 2 3 5 8 13 21 34
         */

        int first = 0;
        int second = 1;
        int result = 0;
        if (n < 2) {
            result = n;
        }
        for (int i = 0; i < n - 1; ++i) {
            result = first + second;
            first = second;
            second = result;
        }

        if(result == fib(this.n)){
            this.result = String.format("%s %d %s %d ", "fibonacci.Fibonacci number for input", n, "is:", result);
            System.out.println(result);
        }
    }

    private int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
}
