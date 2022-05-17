package lesson_two.oop;

/**
 * Реализовать метод main
 * Который создает объекты класов Cat и Dog используя полиморфизм
 * <p>
 * Вывести на экран голаса животных
 */
public class Polymorphism {

    public static void main(String[] args) {
        Cat tigra = new Cat("Тигра");
        Dog flint = new Dog("Флинт");
        tigra.setSlaveName("Даня");
        flint.setMasterName("Сиёга");
        tigra.Voice();
        flint.Voice();
        tigra.Master();
        flint.Master();
    }
}
