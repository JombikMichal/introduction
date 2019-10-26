public class Prime {
    private final int n;

    public Prime(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void print() {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(String.format("%-2s %-2d %-2s", "Number", n, "is no prime"));
                return;
            }
        }
        System.out.println(String.format("%s %d %s", "Number", n, "is prime"));
    }
}
