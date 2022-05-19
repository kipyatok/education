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

    private String masterName;

    public Dog(String name) {
        setName(name);
    } //fixme wrong, use super or this

    @Override
    public void Voice() {
        System.out.println("Собака " + getName() + " гавкает!");
    }

    @Override
    public void Master(){
        System.out.println(getMasterName() + " хозяин пёсика " + getName());
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
}
