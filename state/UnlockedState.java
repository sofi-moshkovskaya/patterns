public class UnlockedState implements IState {
    private final String name="unlocked";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void lock(State s) {
        s.setState(new LockState());
        System.out.println("State: "+name);
    }

    @Override
    public void unlock(State s) {
        System.out.println("State: "+name);
    }
}
