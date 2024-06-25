package HandleNullObject;

public class NullVehicle implements Vehicle {

    @Override
    public int getFuelTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
    
}
