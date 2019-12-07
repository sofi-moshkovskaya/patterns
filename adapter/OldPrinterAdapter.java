public class OldPrinterAdapter {
    private OldPrinter _old;

    public OldPrinterAdapter(OldPrinter old)
    {
        _old=old;
        _old.setVersion(11);
    }

    public int getVersion() {
        return _old.getVersion();
    }
}
