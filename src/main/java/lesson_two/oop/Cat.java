package lesson_two.oop;

/**
 * Реализовать принцип наследования от класса Animal
 * <p>
 * Добавить поля которые могут быть только у данного класса, но не может быть у класса Dog
 * <p>
 * Переопределить метод родителя, он должен выводить на экран: Кошка (name) мяукает!
 * (name) - имя или кличка кошки;
 * <p>
 * Объект нельзя создать без имени или клички
 */
public class Cat extends Animal {

    private String slaveName; //fixme need ? (Добавить поля которые могут быть только у данного класса)

    public Cat(String name) {
        this.setName(name);
    } // fixme call super()

    @Override
    public void Voice() {
        System.out.println("Кошка " + getName() + " мяукает!");
    }

    @Override
    public void Master(){
        System.out.println(getSlaveName() + " раб кота " + getName());
    }

    public String getSlaveName(){
        return slaveName;
    }

    public void setSlaveName(String slaveName){
        this.slaveName = slaveName;
    }
}
