public class main {
    public static void main(String args[])
    {
        OldPrinter printer1=new OldPrinter();
        NewDevice device=new NewDevice();

        OldPrinterAdapter printer2 =new OldPrinterAdapter(printer1);

        if(printer2.getVersion()==device.getVersion()) System.out.println("adapter works");
    }
}
