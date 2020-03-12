package Field.Types;

public class IntegerField extends Field<Integer> {

    /**
     * @desc Constructor is defined because throws
     * @param caption
     * @throws InvalidFieldCaptionException
     */

    public IntegerField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        return (value.matches("[+-]?[0-9]+"));
    }

    protected Integer convertFromString(String value) {
        return (Integer.parseInt(value));
    }
}