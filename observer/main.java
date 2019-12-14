public class main {
    public static void main( String [] args) {
        Publisher weatherDate = new Publisher();

        Subscriber weatherDisplay = new Subscriber(weatherDate);

        weatherDate.setDay("saturday");
        weatherDate.setDay("tuesday");
    }
}
