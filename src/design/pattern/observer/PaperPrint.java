package design.pattern.observer;

import design.pattern.subject.Subject;

public class PaperPrint implements Observer{
    Subject subject;
    public PaperPrint(Subject subject){
        this.subject=subject;
        this.subject.register(this);
    }
    @Override
    public void update(String news) {
        System.out.println("PaperPrint : -"+ news);
    }
}
