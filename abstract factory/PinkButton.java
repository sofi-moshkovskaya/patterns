public class PinkButton extends AButton{
    private String colour="Pink";
    public void draw()
    {
        System.out.println(getcolour()+" Button has been created!");
    }

    public String getcolour()
    {return colour;}
}
