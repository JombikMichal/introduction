public class Fibonacci {
    private final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void print() {
        //#8 Print n-th Fibonacci number. Try both approaches. Which one is more efficient?
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 1; i <= n - 2; ++i) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.println(String.format("%s %d %s %d ", "Fibonacci number for input", n, "is:", result));
    }
}
