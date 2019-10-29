import fizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz(45);
    private FizzBuzz fizz = new FizzBuzz(6);
    private FizzBuzz buzz = new FizzBuzz(10);
    private FizzBuzz noFizzBuzz = new FizzBuzz(11);

    @Test
    public void fizzBuzz() {
        fizzBuzz.print();
        final String result = fizzBuzz.getResult();
        final String expected = "FizzBuzz";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fizz() {
        fizz.print();
        final String result = fizz.getResult();
        final String expected = "Fizz";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void Buzz() {
        buzz.print();
        final String result = buzz.getResult();
        final String expected = "Buzz";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void noFizzBuzz() {
        noFizzBuzz.print();
        final String result = noFizzBuzz.getResult();
        final String expected = String.format("%s %d %s", "Your number", 11, "is no divisible by 3 or 5");
        Assert.assertEquals(expected, result);
    }
}
