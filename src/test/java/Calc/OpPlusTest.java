package Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpPlusTest {

    @Test
    public void testExecute() throws Exception {
        //given
        //when
        //then

        OpPlus tester = new OpPlus();

        assertEquals(4.0, tester.execute(2.0, 2.0), 1e-10);
        assertEquals(-3.0, tester.execute(-2.0, -1.0), 1e-10);
    }

    @Test
    public void testGetDescription() throws Exception {
        OpPlus tester = new OpPlus();

        assertEquals("\"+\" - операция сложения", tester.getDescription());
    }
}