public class object implements Copy {
    private String info;

    object(String i)
    {
        info=i;
    }

    object(object obj)
    {this.info=obj.info;}

    public object copy()
    {
        return new object(this);
    }

    public void print()
    {
        System.out.println(info);
    }
}
