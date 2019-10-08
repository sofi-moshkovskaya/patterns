public class main {
    public static void main(String[] args)
    {
        BuyHouse myhouse= new BuyHouse();
        Vilage housetype=new Vilage();
        myhouse.SetHouse(housetype);
        House house = myhouse.GetHouse();
        house.print();


    }
}
