public class PasswordCheck implements ICheck {
    private Server server;
    private ICheck chain;

    public PasswordCheck(Server server) {
        this.server = server;
    }

    @Override
    public void setNextChain(ICheck nextChain) {
        this.chain=nextChain;
    }

    public boolean validate(String email, String password) {
        boolean res=true;
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            res= false;
        }
        return res;
    }
}
