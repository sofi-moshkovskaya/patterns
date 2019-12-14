import java.util.ArrayList;

public class Publisher implements IPublisher{
    private ArrayList<ISubscriber> subscribers=new ArrayList();
    private String day;

    public void send()
    {
        for(ISubscriber s:subscribers)
        {
            s.update(day);
        }
    }

    public void subscribe(ISubscriber s)
    {
        subscribers.add(s);
    }

    public void unsubscribe(ISubscriber s)
    {subscribers.remove(s);}

    public void setDay(String day)
    {
        this.day=day;
        this.send();
    }
}
