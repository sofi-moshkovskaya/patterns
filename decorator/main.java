public class main {
    public static void main(String args[])
    {
        Coffee coffee=new Latte();
        coffee.order();

        coffee=new Cappuccino();
        coffee.order();

        coffee=new CoffeeWithMilk();
        coffee.order();
    }
}
