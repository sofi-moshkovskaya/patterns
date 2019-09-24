public class BeautifulFactory extends AFactory {
    public AButton create()
    {
        return new GreenButton();
    }
}
