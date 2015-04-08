package Calc;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sokol
 * Date: 13.03.15
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public class CalculatCore {

    MapWithOp mapOperation = new MapWithOp(); //замокать это

    public double runExecute(String operation, double a, double b) throws IncorrectOperatorException, CalculateException {
        double res = 0;

        Operation oper = mapOperation.getOperationList().get(operation);
        if (oper == null) {
            throw new IncorrectOperatorException("Ошибка: Неподдерживаемая операция: \"" + operation + "\" .Попробуйте снова.");
        }

        res = oper.execute(a, b);

        return res;
    }

//    public Operation getOperation(String operation) {
//         return mapOperation.getOperationList().get(operation);
//    }

    public String getDescriptions(){
        StringBuilder helpText = new StringBuilder();
        helpText.append("Возможные операции:").append("\n");
        for (Map.Entry<String, Operation> pair : mapOperation.getOperationList().entrySet())
        {
            helpText.append(pair.getValue().getDescription()).append("\n");
        }

         return String.valueOf(helpText);
    }
}

