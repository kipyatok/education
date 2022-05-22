package lesson_two.oop;

/**
 * Реализовать метод main
 * Который создает объекты класов Cat и Dog используя полиморфизм
 * <p>
 * Вывести на экран голаса животных
 */
public class Polymorphism {

    public static void main(String[] args) {
        Animal tigra = new Cat("Тигра");
        Animal flint = new Dog("Флинт");
        tigra.Voice();
        flint.Voice();
    }
}
