package binary_operations;

import printers.Printer;

public class ToBinary implements Printer {
    private final int n;
    private String result;

    public ToBinary(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public String getResult() {
        return result;
    }

    /**
     * #10 Convert a number from decimal representation to binary representation.
     **/

    @Override
    public void print() {
        int n = Math.abs(this.n);
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i = i / 2) {
            sb.append(i % 2);
        }
        if (this.n < 0) {
            this.result = String.format("%s %d %s %s", "Your number", this.n, "in binary: -", sb.reverse());
            System.out.println(this.result);
        } else {
            this.result = String.format("%s %d %s %s", "Your number", this.n, "in binary:", sb.reverse());
            System.out.println(this.result);
        }

    }
}

