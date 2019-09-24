public class AButton implements iButton{
    private String colour="";
    public void draw()
    {
        System.out.println(getcolour()+"Button has been created!");
    }
    public String getcolour()
    {return colour;}
}
