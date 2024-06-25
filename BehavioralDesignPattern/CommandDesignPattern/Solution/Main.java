package BehavioralDesignPattern.CommandDesignPattern.Solution;

public class  Main {
    public static void main(String[] args) {
        Airconditioner airconditioner = new Airconditioner();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airconditioner));
        remoteControl.pressButton(); 

        remoteControl.undo();
    }
}
