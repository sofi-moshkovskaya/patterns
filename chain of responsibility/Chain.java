import javax.swing.*;

public class Chain implements ICheck{
    private ICheck c1;
    private Server server;

    public Chain(Server s)
    {
        this.server = s;
        c1=new EmailCheck(server);
        ICheck c2=new PasswordCheck(server);

        c1.setNextChain(c2);
    }

    public ICheck getFirst()
    {
        return c1;
    }

    @Override
    public void setNextChain(ICheck nextChain) {

    }

    @Override
    public boolean validate(String email, String password) {
        return c1.validate(email, password);
    }
}
