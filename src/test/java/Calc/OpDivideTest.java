package Calc;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class OpDivideTest {

    @Test
    public void testExecute() throws Exception {
        OpDivide tester = new OpDivide();

        //позитивное тестирование
        assertEquals(3.0, tester.execute(9.0, 3.0), 1e-10);
        assertEquals(-3.0, tester.execute(-9.0, 3.0), 1e-10);
 }

    @Test(expected = CalculateException.class)
    public void testExecuteWhenDividedByZero() throws Exception {
        OpDivide tester = new OpDivide();

        //негативное тестирование (деление на 0)
        assertEquals(1.0, tester.execute(9.0, 0.0), 1e-10);
    }

    @Test
    public void testGetDescription() throws Exception {
        //Тестируемый класс
        OpDivide tester = new OpDivide();

        assertEquals("\"/\" - операция деления", tester.getDescription());
    }
}