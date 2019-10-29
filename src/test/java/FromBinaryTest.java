import binary_operations.FromBinary;
import org.junit.Assert;
import org.junit.Test;

public class FromBinaryTest {

    @Test
    public void fromBinary() {
        FromBinary fromBinary = new FromBinary("1111");
        fromBinary.print();
        final String result = fromBinary.getResult();
        final String expected = String.format("%s %s %s %d", "Your code", "1111", "in decimal:", 15);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noCorrectChars() {
        FromBinary fromBinary = new FromBinary("a1111");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyInput() {
        FromBinary fromBinary = new FromBinary("");
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void nullInput() {
//        FromBinary fromBinary = new FromBinary(null);
//    }
}
