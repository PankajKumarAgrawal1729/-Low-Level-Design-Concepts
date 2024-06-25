package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public class RoomMaintainanceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing maintainance of Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing maintainance of Double Room");
    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("Performing maintainance of Delux Room");
    }
    
}
