package BehavioralDesignPattern.MediatorDesignPattern.OnlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();

    public void addBidder(Colleague bidder){
        colleagues.add(bidder);
    }

    public void placeBid(Colleague  bidder, int bidAmount){
        for(Colleague colleague : colleagues){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
}
