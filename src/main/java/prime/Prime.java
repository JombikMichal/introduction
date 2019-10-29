package prime;

import printers.Printer;

public class Prime implements Printer {
    private final int n;
    private String result;

    public Prime(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public String getResult() {
        return result;
    }

    private boolean isPrime() {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPrime6k() {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * #6 Determine if number n given as a parameter is a prime.
     */

    @Override
    public void print() {
        if (isPrime() && isPrime6k()) {
            this.result = String.format("%s %d %s", "Number", n, "is prime");
            System.out.println(this.result);
        } else {
            this.result = String.format("%-2s %-2d %-2s", "Number", n, "is no prime");
            System.out.println(this.result);
        }
    }

}
