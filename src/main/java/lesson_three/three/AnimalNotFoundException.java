package lesson_three.three;

public class AnimalNotFoundException extends AnimalException{

    private String name;

    public AnimalNotFoundException() {
    }

    public AnimalNotFoundException(String message) {
        super(message);
    }

    public AnimalNotFoundException(String message, String name){
        super(message);
        this.name = name;
    }

    public AnimalNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
