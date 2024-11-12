package ObserverDesign.Observer;

import ObserverDesign.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    StocksObservable observable;
    String MobileNumber;

    public MobileAlertObserver(String MobileNumber, StocksObservable observable){
        this.MobileNumber = MobileNumber;
        this.observable = observable;
    }

    public void update(){
        // observable.getStockCount(); kar sakte hain
        sendMessage(this.MobileNumber, "Product is in stock! Hurry Up!");
    }

    public void sendMessage(String MobileNumber, String message){
        System.out.println("Message sent to : " + MobileNumber + " - " + message);
    }
}
