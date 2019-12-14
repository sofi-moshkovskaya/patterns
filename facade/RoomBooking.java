public class RoomBooking {
    public int Book(int stars)
    {
        int i=0;
        switch (stars)
        {
            case 2:
                i= 100;
            case 3:
                i= 250;
            case 4:
                i= 600;
            case 5:
                i= 1050;
        }
        return i;
    }
}
