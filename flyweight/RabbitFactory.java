import java.util.HashMap;

public class RabbitFactory {

    private HashMap<Integer, Rabbit> rabbits = new HashMap();

    public Rabbit getCharacter(int rabbitType){
        Rabbit rabbit = rabbits.get(new Integer(rabbitType));
        if (rabbit == null){
            switch (rabbitType){
                case 1 : {
                    rabbit = new RabbitTypeA();
                    break;
                }
                case 2 : {
                    rabbit = new RabbitTypeB();
                    break;
                }
            }
            rabbits.put(rabbitType, rabbit);
        }
        return rabbit;
    }
}
