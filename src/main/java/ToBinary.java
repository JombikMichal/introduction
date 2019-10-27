public class ToBinary  implements Printer{
    private final int n;

    public ToBinary(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public void print() {

        /**
         * #10 Convert a number from decimal representation to binary representation.
         **/

        StringBuffer sb = new StringBuffer();
        for (int i = n; i > 0; i = i / 2) {
            sb.append(i % 2);
        }
        System.out.println(String.format("%s %d %s %s", "Your number", n, "in binary:", sb.reverse()));
        System.out.println();
        System.out.println();
    }
}

