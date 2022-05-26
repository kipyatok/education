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

    private String colorOfTray;

    public Cat(String name) {
        super.setName(name);
    }

    @Override
    public void Voice() {
        System.out.println("Кошка " + getName() + " мяукает!");
    }

    public String getColorOfTray() {
        return colorOfTray;
    }

    public void setColorOfTray(String colorOfTray) {
        this.colorOfTray = colorOfTray;
    }
}
