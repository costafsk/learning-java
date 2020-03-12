package Field.Specifics;

public class GenderField extends StringField {
    public GenderField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[MF]"));
    }
}