package BehavioralDesignPattern.ObserverDesignPattern.Observable;

import BehavioralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
