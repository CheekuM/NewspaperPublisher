package design.pattern.observer;

import design.pattern.subject.Subject;

public class Web implements Observer{
    Subject subject;
    public Web(Subject subject){
        this.subject=subject;
        this.subject.register(this);
    }
    @Override
    public void update(String news) {
        System.out.println("Web : -"+ news);
    }

}
