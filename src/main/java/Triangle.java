public class Triangle {
    private final int height;

    public Triangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        //#2 Implement a method that will draw a triangle from * for given height h,
        for (int i = 0; i < height; i++) {
            System.out.println("*".repeat(i + 1));
        }
    }
}
