package HandleNullObject;

public class Car implements Vehicle{

    @Override
    public int getFuelTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() { 
        return 5;
    }
    
}
