import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Chain chain;

    public void setChain(Chain c)
    {
        chain=c;
    }

    public void logIn(String email, String password) {
        if (chain.validate(email, password)) {
            System.out.println("Authorization have been successful!");
        }
        else
            System.out.println("Authorization failed!");
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }

}
