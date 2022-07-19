package lesson_three.three;

public class AnimalException extends RuntimeException {
    public AnimalException() {
    }

    public AnimalException(String message) {
        super(message);
    }

    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }
}
