package ObserverDesign;

import ObserverDesign.Observable.StocksObservable;
import ObserverDesign.Observable.iPhoneObservable;
import ObserverDesign.Observer.EmailAlertObserver;
import ObserverDesign.Observer.MobileAlertObserver;
import ObserverDesign.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){

        StocksObservable observable = new iPhoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("peterudeskey@gmail.com", observable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("vaibhav@gmail.com", observable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("7027271549", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);
    }
}
