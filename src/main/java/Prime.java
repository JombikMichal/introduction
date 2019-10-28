public class Prime implements Printer {
    private final int n;
    private boolean prime;
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
                prime = true;
            }
        }
        return prime;
    }

//    private boolean isPrime2() {
//        if((6*n - 1)){
//
//        }
//        return prime;
//    }

    /**
     * #6 Determine if number n given as a parameter is a prime.
     */

    @Override
    public void print() {
        if (isPrime()) {
            this.result = String.format("%-2s %-2d %-2s", "Number", n, "is no prime");
            System.out.println(this.result);
        } else {
            this.result = String.format("%s %d %s", "Number", n, "is prime");
            System.out.println(this.result);
        }
    }

}
