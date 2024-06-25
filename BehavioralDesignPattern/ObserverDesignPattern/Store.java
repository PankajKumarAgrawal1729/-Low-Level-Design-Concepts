package BehavioralDesignPattern.ObserverDesignPattern;

import BehavioralDesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import BehavioralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;
import BehavioralDesignPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import BehavioralDesignPattern.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import BehavioralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphonStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("Pankaj", iphonStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("pankaj@xyz.com", iphonStocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("mahi@xyz.com", iphonStocksObservable);

        iphonStocksObservable.addObserver(observer1);
        iphonStocksObservable.addObserver(observer2);
        iphonStocksObservable.addObserver(observer3);

        iphonStocksObservable.setStockCount(10);

    }
}
