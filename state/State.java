public class State {
    private IState state=new LockState();

    public void setState(IState s)
    {this.state=s;}

    public IState getState()
    {return state;}

    public void lock()
    {
        state.lock(this);
    }

    public void unlock()
    {
        state.unlock(this);
    }
}
