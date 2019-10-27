public class MultiplicationTable implements Printer{
    private final int n;
    private final int itertion;

    public MultiplicationTable(int n, int itertion) {
        this.n = n;
        this.itertion = itertion;
    }

    public int getN() {
        return n;
    }

    public int getItertion() {
        return itertion;
    }

    @Override
    public void print() {

        /**
         * #5 Print a multiplication table for a given number n + 2. Number of iterations is given as a parameter.
         * */

        for (int i = 1; i <= itertion; i++) {
            System.out.println(String.format("%-3d %-3s %-3d %-3s %d ", i, "*", n, "=", (n * i)));
        }
        System.out.println();
        System.out.println();
    }
}
