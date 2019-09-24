public class GreenButton extends AButton {
    private String colour="Green";
    public void draw()
    {
        System.out.println(getcolour()+" Button has been created!");
    }

    public String getcolour()
    {return colour;}
}
