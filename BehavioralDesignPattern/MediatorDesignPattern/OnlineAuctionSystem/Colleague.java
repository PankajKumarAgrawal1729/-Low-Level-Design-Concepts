package BehavioralDesignPattern.MediatorDesignPattern.OnlineAuctionSystem;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getName(); 
}