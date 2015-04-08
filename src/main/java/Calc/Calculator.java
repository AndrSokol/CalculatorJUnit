package Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Sokol
 * Date: 11.03.15
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double first;
        double second;
        double res;
        String operator;

        CalculatCore calcCore = new CalculatCore();
        while (true) {

            System.out.println("первое число");

            String firstWord = rd.readLine();
            if ("exit".equals(firstWord)) {
                System.out.println("Работа завершена");
                System.exit(0);
            }

            if ("help".equals(firstWord)) {
                System.out.println(calcCore.getDescriptions());
                continue;
            }

            try {
                first = Double.parseDouble(firstWord);
            } catch (NumberFormatException e) {
                System.out.println("Можно вводить только числа");
                continue;
            }
            System.out.println("операция");
            operator = rd.readLine();

            try {
                System.out.println("второе число");
                second = Double.parseDouble(rd.readLine());

            } catch (NumberFormatException e) {
                System.out.println("Можно вводить только числа");
                continue;
            }

            try {
                System.out.println(calcCore.runExecute(operator, first, second));
            } catch (CalculateException e) {
                System.out.println(e.getMessage());
                continue;

            } catch (IncorrectOperatorException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }

    }

}


