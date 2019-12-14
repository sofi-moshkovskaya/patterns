import java.util.ArrayList;

public class Box implements Shape {
    private ArrayList<Shape> shapes=new ArrayList();

    Box(){};

    public void add(Shape s)
    {
        shapes.add(s);
    }

    public void remove(Shape s)
    {
        shapes.remove(s);
    }

    public String getShape()
    {
        String inBox="";
        for(Shape s:this.shapes)
        {
            inBox+='\n';
            inBox+=s.getShape();
        }
        return inBox;
    }

}
