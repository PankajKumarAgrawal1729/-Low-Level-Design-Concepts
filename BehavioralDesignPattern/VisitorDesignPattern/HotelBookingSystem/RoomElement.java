package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
