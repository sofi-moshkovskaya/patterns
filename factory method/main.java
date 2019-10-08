public class main {
    public static void main(String[] args)
    {
        String type="pdf";
        IDoc document= DocFactory.GetDocument(type);
        document.GetType();

    }
}

