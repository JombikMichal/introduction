public class Tree {
    private final int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        //#3 Print a tree from * for given height h.
        for (int i = 0; i < height; i++) {
            System.out.print(" ".repeat(height - 1 - i));
            System.out.print("*".repeat(i * 2 + 1));
            System.out.println();
        }
    }
}
