package lesson_two.oop;

/**
 * Реализовать принцип наследования от класса Animal
 * <p>
 * Добавить поля которые могут быть только у данного класса, но не может быть у класса Cat
 * <p>
 * Переопределить метод родителя, он должен выводить на экран: Собака (name) гавкает!
 * (name) - имя или кличка собаки;
 * <p>
 * Объект нельзя создать без имени или клички
 */
public class Dog extends Animal {

    private int lengthOfLid;

    public Dog(String name) {
        super.setName(name);
    } //fixme super(name)

    @Override
    public void Voice() {
        System.out.println("Собака " + getName() + " гавкает!");
    } //fixme rename

    public int getLengthOfLid() {
        return lengthOfLid;
    }

    public void setLengthOfLid(int lengthOfLid) {
        this.lengthOfLid = lengthOfLid;
    }
}
