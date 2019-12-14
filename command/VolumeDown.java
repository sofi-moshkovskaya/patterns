public class VolumeDown implements ICommand {
    Radio radio;

    VolumeDown(Radio r)
    {this.radio=r;}


    @Override
    public void done() {
        radio.volumeDown();
    }
}
