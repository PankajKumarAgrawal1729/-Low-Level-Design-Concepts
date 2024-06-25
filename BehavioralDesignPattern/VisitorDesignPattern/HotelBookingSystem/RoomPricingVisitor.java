package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Pricing computation logic of Single Room");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Pricing computation logic of Double Room");
        doubleRoomObj.roomPrice = 2000;    
    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("Pricing computation logic of Delux Room");
        deluxRoomObj.roomPrice = 5000;
    }
}
