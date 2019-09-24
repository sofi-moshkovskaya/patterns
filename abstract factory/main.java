public class main {

    public static void main(String[] args)
    {
        SimpleFactory factory=new SimpleFactory();
        AButton button = factory.create();
        button.draw();

    }
}
