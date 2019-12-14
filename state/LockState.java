public class LockState implements IState {
    private final String name="locked";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void lock(State s) {
        System.out.println("State: "+name);
    }

    @Override
    public void unlock(State s) {
        s.setState(new UnlockedState());
        System.out.println("State: "+name);
    }
}
