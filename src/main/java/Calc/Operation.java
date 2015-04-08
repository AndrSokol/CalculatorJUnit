package Calc;

/**
 * Created with IntelliJ IDEA.
 * User: Sokol
 * Date: 11.03.15
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public interface Operation {

    public double execute(double a, double b) throws CalculateException;
    public String getDescription();


}
