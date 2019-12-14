public class SpaBooking {
    public int Book(int procedures)
    {
        int i=0;
        switch (procedures)
        {
            case 1:
                i=500;
                break;
            case 2:
                i= 1000;
                break;
            case 3:
                i= 1650;
                break;
            case 4:
                i= 2500;
                break;
            case 5:
                i= 4999;
                break;
            default:
                System.out.println("there is less procedures available in our SPA");
        }
        return i;
    }
}
