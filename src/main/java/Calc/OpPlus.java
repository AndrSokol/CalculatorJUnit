package Calc;

/**
 * Created with IntelliJ IDEA.
 * User: Sokol
 * Date: 13.03.15
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
public class OpPlus implements Operation{
    double res;

    @Override
    public double execute(double a, double b) {
         res = a + b;

        return res;
    }
    @Override
    public String getDescription() {
        return "\"+\" - операция сложения";
    }
}
