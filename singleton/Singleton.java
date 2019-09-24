public class Singleton {
    static Singleton _obj;
    Singleton() {};

    public Singleton Getobject()
    {
        if (_obj==null)
            _obj=new Singleton();

        return _obj;
    }
}
