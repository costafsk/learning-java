package Field.Specifics;

public class EmailField extends StringField {
    public EmailField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[a-z0-9]+([_\\.][a-z0-9]+)*@[a-z0-9]+([_\\.][a-z0-9]+)\\.[a-z]{3}(\\.[a-z]{2})?"));
    }
}