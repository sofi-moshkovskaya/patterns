public class main {
    public static void main (String []arg)
    {
        Figure f1=new Figure("oval");
        Figure f2=new Figure("circle");
        Figure f3=new Figure("square");

        Box b1=new Box();
        Box b2=new Box();

        b1.add(f1);
        b1.add(f2);
        b2.add(f3);

        b2.add(b1);

        System.out.println(b2.getShape());

    }
}
