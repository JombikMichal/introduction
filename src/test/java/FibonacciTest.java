import fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci(7);

    @Test
    public void fibonacci() {
        fibonacci.print();
        final String result = fibonacci.getResult();
        final String expected = String.format("%s %d %s %d ", "fibonacci.Fibonacci number for input", 7, "is:", 13);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeValue() {
        Fibonacci fibonacci = new Fibonacci(-7);
    }
}
