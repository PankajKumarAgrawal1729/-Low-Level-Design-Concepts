package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxRoom deluxRoomObj);
}
