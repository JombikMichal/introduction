public class Triangle implements Printer{
    private final int height;

    public Triangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void print() {

        /**
         * #2 Implement a method that will draw a triangle from * for given height h
         */

        for (int i = 0; i < height; i++) {
            System.out.println("*".repeat(i + 1));
        }
        System.out.println();
        System.out.println();
    }
}
