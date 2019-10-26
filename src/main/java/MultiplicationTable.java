public class MultiplicationTable {
    private final int n;

    public MultiplicationTable(int n) {
        this.n = n;
    }

    public int getNumber() {
        return n;
    }

    public void print() {
        //#5 Print a multiplication table for a given number n
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
}
