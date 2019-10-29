import binary_operations.ToBinary;
import org.junit.Assert;
import org.junit.Test;

public class ToBinaryTest {

    private ToBinary toBinary = new ToBinary(15);
    private ToBinary toBinaryNegative = new ToBinary(-15);

    @Test
    public void toBinary() {
        toBinary.print();
        final String result = toBinary.getResult();
        final String expected = String.format("%s %d %s %s", "Your number", 15, "in binary:", "1111");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void toBinaryNegative() {
        toBinaryNegative.print();
        final String result = toBinaryNegative.getResult();
        final String expected = String.format("%s %d %s %s", "Your number", -15, "in binary: -", "1111");
        Assert.assertEquals(expected, result);
    }
}
