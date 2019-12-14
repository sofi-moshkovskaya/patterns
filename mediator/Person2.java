public class Person2 extends Person {
    Person2(IMediator m)
    {super(m);}

    @Override
    public void Notify(String sms) {
        System.out.println("Person2 has received: "+sms);
    }

}
