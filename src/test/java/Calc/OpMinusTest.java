package Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpMinusTest {

    @Test
    public void testExecute() throws Exception {
        //Тестируемый класс
        OpMinus tester = new OpMinus();

        // Проверяемый метод execute
        assertEquals(2.0, tester.execute(6.0, 4.0), 1e-10);
        assertEquals(-10.0, tester.execute(-6.0, 4.0), 1e-10);
    }

    @Test
    public void testGetDescription() throws Exception {
        //Тестируемый класс
        OpMinus tester = new OpMinus();

        assertEquals("\"-\" - операция вычитания", tester.getDescription());
    }
}