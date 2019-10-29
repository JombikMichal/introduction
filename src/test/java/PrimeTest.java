import org.junit.Assert;
import org.junit.Test;
import prime.Prime;

public class PrimeTest {
    private Prime prime = new Prime(7);
    private Prime noPrime = new Prime(8);

    @Test
    public void isPrime() {
        prime.print();
        final String result = prime.getResult();
        final String expected = String.format("%s %d %s", "Number", 7, "is prime");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isNoPrime() {
        noPrime.print();
        final String result = noPrime.getResult();
        final String expected = String.format("%-2s %-2d %-2s", "Number", 8, "is no prime");
        Assert.assertEquals(expected, result);
    }
}
