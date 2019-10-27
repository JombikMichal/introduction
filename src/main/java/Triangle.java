public class Triangle implements Printer{
    private final int height;

    public Triangle(int height) throws IllegalArgumentException{
        if(height < 0){
            throw new IllegalArgumentException("Entered number is less than zero!");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    /**
     * #2 Implement a method that will draw a triangle from * for given height h
     */

    @Override
    public void print() {
        for (int i = 0; i < height; i++) {
            System.out.println("*".repeat(i + 1));
        }
    }
}
