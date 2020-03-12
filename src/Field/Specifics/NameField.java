package Field.Specifics;

public class NameField extends StringField {
    public NameField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[A-Z][a-z]+( [A-Z][a-z]+)+"));
    }
}