public class On implements ICommand {
    Radio radio;

    On(Radio r)
    {this.radio=r;}


    @Override
    public void done() {
        radio.turnOn();
    }
}
