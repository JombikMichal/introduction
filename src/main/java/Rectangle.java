public class Rectangle implements Printer{
    private final int m;
    private final int n;

    public Rectangle(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public void print() {

        /**
         * #4 Print a rectangle from * with sides m and n
         */

        if (n == m) {
            throw new IllegalArgumentException("This is no rectangle but this is squere! Reason: side m is equals side n! Try again! Enjoy :) ");
        }
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Some side is equals zero!");
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == m || j == 0 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ".repeat(3));
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
