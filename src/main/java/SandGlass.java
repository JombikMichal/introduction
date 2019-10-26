public class SandGlass {
    private final int n;
    private Tree tree;

    public SandGlass(int n) {
        this.n = n;
        this.tree = new Tree(this.n);
    }

    public int getN() {
        return n;
    }

    void print() {
        //#6 Print a sand glass from * with height n (odd)
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(" ".repeat(i));
                System.out.print("*".repeat((n * 2) - (i * 2) - 1));
                System.out.println();
            }
        }
        tree.print();
    }
}
