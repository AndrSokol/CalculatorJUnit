package Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatCoreTest {

    @Test
    public void testRunExecutePlusOperation() throws Exception {
    CalculatCore tester = new CalculatCore();

    assertEquals(4.0, tester.runExecute("+", 2.0, 2.0), 1e-10);

    }

    @Test
    public void testRunExecuteMinusOperation() throws Exception {
        CalculatCore tester = new CalculatCore();

        assertEquals(0.0, tester.runExecute("-", 2.0, 2.0), 1e-10);

    }

    @Test
    public void testRunExecuteMultiplyOperation() throws Exception {
        CalculatCore tester = new CalculatCore();

        assertEquals(6.0, tester.runExecute("*", 2.0, 3.0), 1e-10);

    }

    @Test
    public void testRunExecuteDivideOperation() throws Exception {
        CalculatCore tester = new CalculatCore();

        assertEquals(1.0, tester.runExecute("/", 2.0, 2.0), 1e-10);

    }
}