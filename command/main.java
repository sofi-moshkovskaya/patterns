public class main {
    public static void main(String args[])
    {
        Radio radio=new Radio();

        ICommand on=new On(radio);
        ICommand off=new Off(radio);
        ICommand volumeup=new VolumeUp(radio);
        ICommand volumedown=new VolumeDown(radio);

        Switch s=new Switch();
        s.AddCommand("on",on);
        s.AddCommand("off", off);
        s.AddCommand("up",volumeup);
        s.AddCommand("down",volumedown);

        s.done("on");
        s.done("up");
        s.done("off");

    }
}
