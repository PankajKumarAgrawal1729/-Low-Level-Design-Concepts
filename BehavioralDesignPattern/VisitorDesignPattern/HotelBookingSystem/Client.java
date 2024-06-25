package BehavioralDesignPattern.VisitorDesignPattern.HotelBookingSystem;

public class Client {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement deluxRoomObj = new DeluxRoom();

        // perform an operation on these objects
        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(((SingleRoom)singleRoomObj).roomPrice);

        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(((DoubleRoom)doubleRoomObj).roomPrice);

        deluxRoomObj.accept(pricingVisitorObj);
        System.out.println(((DeluxRoom)deluxRoomObj).roomPrice);

        // perform another operation on these objects
        RoomVisitor maintainanceVisitorObj = new RoomMaintainanceVisitor();
        singleRoomObj.accept(maintainanceVisitorObj);
        doubleRoomObj.accept(maintainanceVisitorObj);
        deluxRoomObj.accept(maintainanceVisitorObj);
    }
}
 