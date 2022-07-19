package lesson_three.three;

public class AnimalNotSupportedException extends AnimalException{

    Animal animal;

    public AnimalNotSupportedException() {
    }

    public AnimalNotSupportedException(String message) {
        super(message);
    }

    public AnimalNotSupportedException(String message, Animal animal){
        super(message);
        this.animal = animal;
    }

    public AnimalNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public Animal getAnimal(){
        return animal;
    }
}
