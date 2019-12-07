public class RabbitTypeA extends Rabbit{
    public RabbitTypeA(){
        age=3;
        color="grey";
        weight=2;
    }

    public void Print()
    {
        System.out.println("Type A\tage="+age+"\tcolor="+color+"\tweight="+weight);
    }
}
