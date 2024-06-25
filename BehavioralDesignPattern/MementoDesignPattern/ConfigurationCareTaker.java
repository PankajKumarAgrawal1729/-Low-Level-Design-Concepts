package BehavioralDesignPattern.MementoDesignPattern;

import java.util.Stack;

public class ConfigurationCareTaker {
    Stack<ConfigurationMemento> history = new Stack<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null; 
    }
}
