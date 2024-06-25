package BehavioralDesignPattern.CommandDesignPattern.Solution;

import java.util.Stack;

public class RemoteControl {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public RemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void pressButton(){
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo(){
        if(!acCommandHistory.isEmpty()){
             ICommand lastCommand = acCommandHistory.pop();
             lastCommand.undo();
        }
    }
}
