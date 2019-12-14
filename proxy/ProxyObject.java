public class ProxyObject implements IObject {
    IObject obj;

    private void lazyInit() {
        if (obj == null) {
            obj = new Object();

        }
    }

    public void action()
    {
        this.lazyInit();
        obj.action();
    }
}
