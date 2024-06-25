package BehavioralDesignPattern.CommandDesignPattern.Solution;

public class TurnACOnCommand implements ICommand {

    Airconditioner ac;

    public TurnACOnCommand(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }

}
