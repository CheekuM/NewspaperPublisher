package design.pattern.subject;

import design.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class HindustanTimes implements Subject{
    List<Observer> observerList = new ArrayList<>();
    private String news;
    public HindustanTimes(){

    }
    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unRegister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(news);
        }
    }
    public void setNews(String news){
        this.news = news;
        notifyObserver();
    }
}
