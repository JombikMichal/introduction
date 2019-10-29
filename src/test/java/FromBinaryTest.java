import binary_operations.FromBinary;
import org.junit.Assert;
import org.junit.Test;

public class FromBinaryTest {
    private FromBinary fromBinary = new FromBinary("1111");

    @Test
    public void fromBinary() {
        fromBinary.print();
        final String result = fromBinary.getResult();
        final String expected = String.format("%s %s %s %d", "Your code", "1111", "in decimal:", 15);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noCorrectChars() {
        FromBinary fromBinary = new FromBinary("a1111");
    }
}
