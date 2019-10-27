public class ToBinary implements Printer {
    private final int n;

    public ToBinary(int n) {

            this.n = n;

    }

    public int getN() {
        return n;
    }

    /**
     * #10 Convert a number from decimal representation to binary representation.
     **/

    @Override
    public void print() {
        int n = Math.abs(this.n);
        StringBuffer sb = new StringBuffer();
        for (int i = n; i > 0; i = i / 2) {
            sb.append(i % 2);
        }
        if (this.n < 0) {
            System.out.println(String.format("%s %d %s %s", "Your number", this.n, "in binary: -", sb.reverse()));
        } else {
            System.out.println(String.format("%s %d %s %s", "Your number", this.n, "in binary:", sb.reverse()));
        }

    }
}

