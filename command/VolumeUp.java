public class VolumeUp implements ICommand{
    Radio radio;

    VolumeUp(Radio r)
    {this.radio=r;}


    @Override
    public void done() {
        radio.volumeUp();
    }
}
