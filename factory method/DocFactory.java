public class DocFactory {
    public static IDoc GetDocument(String type) {
        type.toLowerCase();
        switch (type) {
            case "docx": return new WordDoc();
            case "pdf": return new PdfDoc();
            case "pptx": return new PPDoc();
            case "txt":return new TxtDoc();
            default: return new TxtDoc();
        }
    }
}
