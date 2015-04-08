package Calc;

/**
 * Created with IntelliJ IDEA.
 * User: Sokol
 * Date: 13.03.15
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public class OpDivide implements Operation {
    double res;

    @Override
    public double execute(double a, double b) throws CalculateException {
        if (b == 0)  {
            throw new CalculateException("Ошибка: Делить на ноль нельзя!!!!!");
        }
        res = a / b;
        return res;
    }
    @Override
    public String getDescription() {
        return "\"/\" - операция деления";
    }
}
