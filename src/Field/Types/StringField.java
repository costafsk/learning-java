package Field.Types;

public class StringField extends Field<String> {

    public StringField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[a-zA-Z]+( [a-zA-Z]+)*"));
    }

    protected String convertFromString(String value) {
        return (Double.parseDouble(value));
    }
}