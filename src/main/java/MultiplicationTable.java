public class MultiplicationTable implements Printer{
    private final int n;
    private final int itertion;
    private String result;

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

    public String getResult() {
        return result;
    }

    /**
     * #5 Print a multiplication table for a given number n + 2. Number of iterations is given as a parameter.
     * */

    @Override
    public void print() {
        for (int i = 1; i <= itertion; i++) {
            if(n <0){
                this.result = String.format("%-3d %-3s (%-3d) %-3s %d ", i, "*", n, "=", (n * i));
                System.out.println(this.result);
            }else {
                this.result = String.format("%-3d %-3s %-3d %-3s %d ", i, "*", n, "=", (n * i));
                System.out.println(this.result);
            }
        }
    }
}
