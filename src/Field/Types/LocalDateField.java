package Field.Types;

import java.time.LocalDate;

public class LocalDateField extends Field<LocalDate> {
    public LocalDateField(String caption) throws InvalidFieldCaptionException {
        super(caption);
    }

    protected boolean isValid(String value) {
        try {
            return (LocalDate.parse(value) != null);
        } catch (Exception exception) {
            return (false);
        }
    }
}