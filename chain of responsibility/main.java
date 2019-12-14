public class main {
    public static void main(String args[])
    {
        Server server=new Server();
        server.register("admin@gmail.com", "admin_pass");
        server.register("user@gmail.com", "user_pass");

        Chain c=new Chain(server);
        server.setChain(c);


        server.logIn("admin@gmail.com", "admin_pass");
    }
}
