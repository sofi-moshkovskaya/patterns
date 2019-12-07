public class main {
    public static void main(String[] args) {
        RabbitFactory factory = new RabbitFactory();

        int[] characterCodes = {1, 2};
        for (int nextCode : characterCodes) {
            Rabbit rabbit = factory.getCharacter(nextCode);
            rabbit.Print();
        }
    }
}
