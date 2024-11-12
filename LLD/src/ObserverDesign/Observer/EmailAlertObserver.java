package ObserverDesign.Observer;

import ObserverDesign.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    StocksObservable observable;
    String emailId;

    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    public void update(){
        // observable.getStockCount(); kar sakte hain
        sendMail(this.emailId, "Product is in stock! Hurry Up!");
    }

    public void sendMail(String emailId, String message){
        System.out.println("Mail sent to : " + emailId + " - " + message);
    }
}
