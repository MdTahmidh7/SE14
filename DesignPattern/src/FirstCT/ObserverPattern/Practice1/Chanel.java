package FirstCT.ObserverPattern.Practice1;

import java.util.ArrayList;
import java.util.List;

public class Chanel implements IChanel {
    private String title;
    private List<Subscriber> subscribersList = new ArrayList<>();
    public String videoTitle;

    @Override
    public void subscribe(Subscriber subscriberName) {
        subscribersList.add(subscriberName);
    }

    @Override
    public void unSubscribe(Subscriber subscriberName) {
        subscribersList.remove(subscriberName);
    }

    public void notifySubscriber() {
        for (Subscriber subscriber :
                subscribersList) {
            subscriber.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.videoTitle = videoTitle;
        notifySubscriber();
    }

}
