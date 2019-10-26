public class MultiplicationTable {
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

    //#5 - 1
//    public void print() {
//        //#5 Print a multiplication table for a given number n
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i + " * " + n + " = " + (i * n));
//        }
//    }

    //#5 - 2 Number of iterations is given as a parameter.
    public void print() {
        //#5 Print a multiplication table for a given number n
        for (int i = 1; i <= itertion; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
}
