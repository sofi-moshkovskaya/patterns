public class Mediator implements IMediator{
    private Person1 p1;
    private Person2 p2;


    public void set (Person1 p, Person2 pp)
    {
        p1=p;
        p2=pp;
    }


    @Override
    public void text(String text,Person p) {
        if(p.equals(p1))
            p1.Notify(text);
        else
            p2.Notify(text);
    }
}
