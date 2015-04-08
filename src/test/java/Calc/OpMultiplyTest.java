package Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpMultiplyTest {

    @Test
    public void testExecute() throws Exception {
        OpMultiply tester = new OpMultiply();

        assertEquals(9.0, tester.execute(3.0, 3.0), 1e-10);
        assertEquals(-4.0, tester.execute(-2.0, 2.0), 1e-10);
        assertEquals(4.0, tester.execute(-2.0, -2.0), 1e-10);
    }

    @Test
    public void testGetDescription() throws Exception {
        OpMultiply tester = new OpMultiply();

        assertEquals("\"*\" - операция умножения", tester.getDescription());
    }
}