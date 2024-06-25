package BehavioralDesignPattern.MementoDesignPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObj = new ConfigurationCareTaker();
        // initiate state of the originator
        ConfigurationOriginator originatorObj = new ConfigurationOriginator(5, 10);

        // save it
        ConfigurationMemento snapShot1 = originatorObj.createMemeto();

        // add it to history
        careTakerObj.addMemento(snapShot1);

        // originator changing to new state
        originatorObj.setHeight(7);
        originatorObj.setWidth(12);

        // save it
        ConfigurationMemento snapShot2 = originatorObj.createMemeto();

        // add it to history
        careTakerObj.addMemento(snapShot2);

        // originator changing to new state
        originatorObj.setHeight(9 );
        originatorObj.setWidth(14); 

        // Undo
         ConfigurationMemento restoredMementoObj = careTakerObj.undo();
         originatorObj.restoreMemento(restoredMementoObj);

         System.out.println("Height: " + originatorObj.height + " Width: " + originatorObj.width);
    }
}
