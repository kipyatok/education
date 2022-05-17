package lesson_two.oop;

/**
 * Реализовать инкапусуляцию для общего класса Animal
 * <p>
 * Поля могут быть произвольными, но чтоб соотвествовали так же следующему принципу
 * <p>
 * Сделать метод отвещающий за голос, по умолчанию он выводит на экран: Голос
 */
public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Voice(){
        System.out.println("Голос");
    }

    public void Master(){
        System.out.println("Хозяин");
    }
}
