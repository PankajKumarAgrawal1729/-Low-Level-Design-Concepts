package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public class DeluxRoom implements RoomElement {
    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
       visitor.visit(this);
    }

}
