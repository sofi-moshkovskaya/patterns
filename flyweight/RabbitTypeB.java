public class RabbitTypeB extends Rabbit {
    RabbitTypeB() {
        age = 5;
        color = "white";
        weight = 4;
    }

    public void Print() {
        System.out.println("Type B\tage=" + age + "\tcolor=" + color + "\tweight=" + weight);
    }
}
