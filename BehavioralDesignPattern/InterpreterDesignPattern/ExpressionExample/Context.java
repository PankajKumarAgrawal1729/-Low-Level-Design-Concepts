package BehavioralDesignPattern.InterpreterDesignPattern.ExpressionExample;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String strVariable, int intValue){
        contextMap.put(strVariable, intValue);
    }

    public int get(String strValue){
        return contextMap.get(strValue);
    }
}
