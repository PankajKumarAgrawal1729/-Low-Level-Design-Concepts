package BehavioralDesignPattern.ObserverDesignPattern.Observer;

import BehavioralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    public void update() {
        sendMsgOnMobile(userName, "Products is in stocks now. Hurry up!");
    }

    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("alert sent to: " + userName  + " with message: " + msg);
    }
}
