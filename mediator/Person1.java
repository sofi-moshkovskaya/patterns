public class Person1 extends Person {
    Person1(IMediator m)
    {super(m);}

    @Override
    public void Notify(String sms) {
        System.out.println("Person1 has received: "+sms);
    }


}
