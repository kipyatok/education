package lesson_three.three;

public class AnimalNotSupportedException extends AnimalException{
    public AnimalNotSupportedException() {
    }

    public AnimalNotSupportedException(String message) {
        super(message);
    }

    public AnimalNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
