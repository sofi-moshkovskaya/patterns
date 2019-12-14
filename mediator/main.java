public class main {

    public static void main(String args[])
    {
        Mediator mediator=new Mediator();
        Person1 p1=new Person1(mediator);
        Person2 p2=new Person2(mediator);

        mediator.set(p1,p2);

        p2.text("hello darkness my old friend");
    }
}
