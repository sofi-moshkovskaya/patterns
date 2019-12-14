public class main {

    public static void main(String args[])
    {
        Radio radio=new Radio();
        RemoteBasic remote=new RemoteBasic(radio);

        radio.printStatus();

        radio.setChannel(12);
        radio.setVolume(88);

        radio.printStatus();
    }
}
