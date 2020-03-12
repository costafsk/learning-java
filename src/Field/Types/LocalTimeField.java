package Field.Types;

import java.time.LocalTime;;

public class LocalTimeField extends Field<LocalTime> {
    public LocalTimeField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        try {
            return (LocalTime.parse(value) != null);
        } catch (Exception exception) {
            return (false);
        }
    }
}