package ObserverPattern.Practice1;

public interface IChanel {
     void subscribe(Subscriber subscriberName);
     void unSubscribe(Subscriber subscriberName);
     void notifySubscriber();

}
