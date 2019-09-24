import java.awt.*;

public class SimpleFactory extends AFactory {
    public AButton create()
    {return new PinkButton();
    }
}
