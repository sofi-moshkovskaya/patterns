public class Off implements ICommand {
    Radio radio;

    Off(Radio r)
    {this.radio=r;}


    @Override
    public void done() {
        radio.turnOff();
    }
}
