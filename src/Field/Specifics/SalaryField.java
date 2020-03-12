public class SalaryField extends DoubleField {
    public SalaryField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[0-9]*\\.?[0-9]+"));
    }
}