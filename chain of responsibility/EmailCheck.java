public class EmailCheck implements ICheck{
    private Server server;
    private ICheck next;

    public EmailCheck(Server server) {
        this.server = server;
    }

    @Override
    public void setNextChain(ICheck nextChain) {
        this.next =nextChain;
    }

    public boolean validate(String email, String password) {
        boolean res=true;
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            res=false;
        }
        res=validateNext(email, password);
        return res;
    }

    protected boolean validateNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.validate(email, password);
    }
}
