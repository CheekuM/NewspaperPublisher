package design.pattern.subject;

import design.pattern.observer.Observer;

public interface Subject {
    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();

}
