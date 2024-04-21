import design.pattern.observer.Mobile;
import design.pattern.observer.Observer;
import design.pattern.observer.PaperPrint;
import design.pattern.observer.Web;
import design.pattern.subject.HindustanTimes;
import design.pattern.subject.Subject;
import design.pattern.subject.TimeOfIndia;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TimeOfIndia timesOfIndia = new TimeOfIndia();
        Observer mobile = new Mobile(timesOfIndia);
        Observer web =new Web(timesOfIndia);
        Observer paperPrint = new PaperPrint(timesOfIndia);
        timesOfIndia.setNews("News from Times of India");

        HindustanTimes hindustanTimes = new HindustanTimes();
         mobile = new Mobile(hindustanTimes);
         web =new Web(hindustanTimes);
         hindustanTimes.unRegister(web);
         paperPrint = new PaperPrint(hindustanTimes);
        hindustanTimes.setNews("News from Hindustan Times");
        hindustanTimes.unRegister(web);
        hindustanTimes.setNews("Latest news from Hindustan Times");
        timesOfIndia.setNews("Latest news from TOI");


    }
}