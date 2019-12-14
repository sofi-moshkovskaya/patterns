public interface IState {
    public String getName();
    public void lock(State s);
    public void unlock(State s);
}
