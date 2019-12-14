public interface ICheck {
    void setNextChain(ICheck nextChain);

    boolean validate(String email, String password);
}
