package ObserverDesign.Observable;

import ObserverDesign.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStocksAdded);
    int getStockCount();
}
