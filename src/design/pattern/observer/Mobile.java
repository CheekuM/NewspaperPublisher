package design.pattern.observer;

import design.pattern.subject.Subject;

public class Mobile implements Observer  {

    Subject subject;
    public Mobile(Subject subject){
        this.subject=subject;
        this.subject.register(this);
    }
    @Override
    public void update(String news) {
        System.out.println("Mobile : -"+ news);
    }
}
