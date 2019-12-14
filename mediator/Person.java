public abstract class Person {
    private IMediator mediator;

    Person(IMediator m)
    {
        mediator=m;
    }

    public abstract void Notify(String sms);

    public void text(String text)
    {
        this.mediator.text(text,this);
    }
}
