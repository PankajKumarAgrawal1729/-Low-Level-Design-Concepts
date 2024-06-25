package BehavioralDesignPattern.CommandDesignPattern.Solution;

public class TurnACOffCommand implements ICommand {

    Airconditioner ac;

    public TurnACOffCommand(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
       ac.turnOnAC();
    }
     
}
