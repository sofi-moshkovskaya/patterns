public class Facade {
    private RoomBooking room=new RoomBooking();
    private SpaBooking spa=new SpaBooking();

    public void Book(int stars, int procedures)
    {
        int total=0;
        total +=room.Book(stars);
        total+=spa.Book(procedures);

        System.out.println("Total price for resort: "+total);
    }
}
