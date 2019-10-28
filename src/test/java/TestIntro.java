import org.junit.Assert;
import org.junit.Test;

public class TestIntro {
    private Fibonacci fibonacci = new Fibonacci(7);
    private FizzBuzz fizzBuzz = new FizzBuzz(45);
    private FromBinary fromBinary = new FromBinary("1111");
    private MultiplicationTable multiplicationTable = new MultiplicationTable(3, 2);
    private Prime prime = new Prime(7);
    private Rectangle rectangle = new Rectangle(5, 5);
    private ToBinary toBinary = new ToBinary(15);

    @Test
    public void fibonacciTest() {
        fibonacci.print();
        final String result = fibonacci.getResult();
        final String expected = String.format("%s %d %s %d ", "Fibonacci number (from recurse function) for input", 7, "is:", 13);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fizzBuzzTest() {
        fizzBuzz.print();
        final String result = fizzBuzz.getResult();
        final String expected = "FizzBuzz";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fromBinaryTest() {
        fromBinary.print();
        final String result = fromBinary.getResult();
        final String expected = String.format("%s %s %s %d", "Your code", "1111", "in decimal:", 15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void multiplicationTableTest() {
        multiplicationTable.print();
        final String result = multiplicationTable.getResult();
        final String expected = String.format("%-3d %-3s %-3d %-3s %d ", 2, "*", 3, "=", 6);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void primeTest() {
        prime.print();
        final String result = prime.getResult();
        final String expected = String.format("%s %d %s", "Number", 7, "is prime");
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void incorectValues() {
        rectangle.print();
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeValues() {
        SandGlass sandGlass = new SandGlass(-3);
        Tree tree = new Tree(-3);
        Triangle triangle = new Triangle(-4);
    }

    @Test
    public void toBinaryTest() {
        toBinary.print();
        final String result = toBinary.getResult();
        final String expected = String.format("%s %d %s %s", "Your number", 15, "in binary:", "1111");
        Assert.assertEquals(expected, result);
    }

}
