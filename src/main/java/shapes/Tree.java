package shapes;

import printers.Printer;

public class Tree implements Printer {
    private final int height;

    public Tree(int height) throws IllegalArgumentException{
        if(height < 0){
            throw new IllegalArgumentException("Entered number is less than zero!");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    /**
     * #3 Print a tree from * for given height h
     */

    @Override
    public void print() {
        for (int i = 0; i < height; i++) {
            System.out.print(" ".repeat(height - 1 - i));
            System.out.print("*".repeat(i * 2 + 1));
            System.out.println();
        }
    }
}
