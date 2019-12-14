public class Subscriber implements ISubscriber{
    private String day;
    private Publisher publisher;

    Subscriber(Publisher p)
    {
        this.publisher= p;
        publisher.subscribe(this);
    }


    public void update(String day)
    {
        this.day=day;
        this.Print();
    }

    public void Print()
    {
        System.out.println("Day: "+this.day);
    }
}
