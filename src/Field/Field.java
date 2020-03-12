import Field.Exceptions.InvalidFieldCaptionException;
import Field.Exceptions.InvalidFieldValueException;

public abstract class Field<T> {
    protected String caption;
    protected T value;

    public Field(String caption) throws InvalidFieldCaptionException {
        if ((caption == null) || (caption.trim().length == 0)) {
            throw new Exception("Nulo nao e um valor valido!");
        } else {
            this.caption = caption;
        }
    }

    public String getCaption() {
        return (this.caption);
    }

    public T getValue() {
        return (this.value);
    }

    public void setValue(String value) {
        if ((value == null) || (value.trim().length == 0)) {
            throw new InvalidFieldValueException();
        } else {
            if (this.isValid(value)) {
                this.value = this.convertFromString(value);
            } else {
                throw new InvalidFieldValueException();
            }
        }
    }

    protected abstract boolean isValid(String value);

    protected abstract T convertFromString(String value);
}