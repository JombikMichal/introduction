import multiplication.MultiplicationTable;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTableTest {
    private MultiplicationTable multiplicationTable = new MultiplicationTable(3, 2);

    @Test
    public void multiplicationTable() {
        multiplicationTable.print();
        final String result = multiplicationTable.getResult();
        final String expected = String.format("%-3d %-3s %-3d %-3s %d ", 2, "*", 3, "=", 6);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeValue() {
        MultiplicationTable multiplicationTable = new MultiplicationTable(2,-7);
    }
}
