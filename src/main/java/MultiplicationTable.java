public class MultiplicationTable implements Printer{
    private final int n;
    private final int itertion;

    public MultiplicationTable(int n, int itertion) throws IllegalArgumentException{
        if(itertion < 0){
            throw new IllegalArgumentException(String.format("%s %d %s", "You wanna iterate this loop",itertion,"times. This is bullshit!"));
        }
        this.n = n;
        this.itertion = itertion;
    }

    public int getN() {
        return n;
    }

    public int getItertion() {
        return itertion;
    }

    /**
     * #5 Print a multiplication table for a given number n + 2. Number of iterations is given as a parameter.
     * */

    @Override
    public void print() {
        for (int i = 1; i <= itertion; i++) {
            if(n <0){
                System.out.println(String.format("%-3d %-3s (%-3d) %-3s %d ", i, "*", n, "=", (n * i)));
            }else {
                System.out.println(String.format("%-3d %-3s %-3d %-3s %d ", i, "*", n, "=", (n * i)));
            }
        }
    }
}
