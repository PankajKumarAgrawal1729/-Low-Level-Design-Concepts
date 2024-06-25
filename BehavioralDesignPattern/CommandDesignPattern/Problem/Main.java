package BehavioralDesignPattern.CommandDesignPattern.Problem;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAC();
        ac.setTemperature(24);
        ac.turnOffAC();
    }
}


// problem with above implementation
// - Lacks of Abstraction
// Today process of turning on AC is simple, but if there are more steps, client has to aware all of
// that, which is not good.

// - Undo/Redo Functionality:
// What if i want to implement the undo/redo capability. how it will handled.

// - Difficulty in code maintainance
// what if in future, we have to support more commands for more devices example bulb,
