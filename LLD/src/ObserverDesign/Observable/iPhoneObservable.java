package ObserverDesign.Observable;

import ObserverDesign.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class iPhoneObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    int currentStock = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for (NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded){
        if (currentStock == 0){
            notifySubscribers();
            //Bhai agar abhi tak kuch nahi tha and abhi kuch aaya hai, then notify everyone
        }
        currentStock = newStockAdded;
    }

    @Override
    public int getStockCount(){
        return currentStock;
    }
}
