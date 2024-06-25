package BehavioralDesignPattern.ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import BehavioralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stockCount = 0;

    public void addObserver(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    public void removeObserver(NotificationAlertObserver observer) {
        int idx = observersList.indexOf(observer);
        if (idx != -1) {
            observersList.remove(idx);
        }
    }

    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    public int getStockCount() {
        return stockCount;
    }
}
