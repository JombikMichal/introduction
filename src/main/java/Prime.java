public class Prime implements Printer {
    private final int n;
    private boolean prime;

    public Prime(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    private boolean isPrime() {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = true;
            }
        }
        return prime;
    }

    /**
     * #6 Determine if number n given as a parameter is a prime.
     */

    @Override
    public void print() {
        if (isPrime()) {
            System.out.println(String.format("%-2s %-2d %-2s", "Number", n, "is no prime"));
        } else {
            System.out.println(String.format("%s %d %s", "Number", n, "is prime"));
        }
    }

}
