package design.pattern.subject;

import design.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class TimeOfIndia implements Subject{
    List<Observer> observers = new ArrayList<>();
    private String news;
    public TimeOfIndia(){
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unRegister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(news);
        }
    }

    public void setNews(String news){
        this.news =news;
        notifyObserver();
    }
}
