package BehavioralDesignPattern.ObserverDesignPattern.Observer;

import BehavioralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    public void update() {
        sendMail(emailId, "Products is in stocks now. Hurry up!");
    }

    public void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId + " with message: " + msg);
    }
}
