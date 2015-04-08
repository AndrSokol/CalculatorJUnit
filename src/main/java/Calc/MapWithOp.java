package Calc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 19.03.2015.
 */
public class MapWithOp {

    public Map<String, Operation> getOperationList() {
        Map<String, Operation> mapOperation = new HashMap<String, Operation>();

        mapOperation.put("+", new OpPlus());
        mapOperation.put("-", new OpMinus());
        mapOperation.put("/", new OpDivide());
        mapOperation.put("*", new OpMultiply());

        return mapOperation;
    }

}
