package lesson_three.one;

import helper.client.Client;

import java.math.BigDecimal;
import java.math.BigInteger; //fixme remove unnecessary imports
import java.util.Objects;


/**
 * Данный класc научит бросать исключения
 */
public class LessonException {

    /**
     * Реализовать метод который говорит о том что может бросить проверяемое исключение Exception
     * и бросает его с сообщением : Могу же!
     */
    public void testThrowException() throws Exception {
        throw new Exception("Могу же!");
    }

    /**
     * Реализуйте метод sqrt(), вычисляющий квадратный корень числа.
     * В отличие от Math.sqrt(), это метод при передаче отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException
     * с сообщением "Negative number received : ?", где вместо вопросика будет подставлено фактически переданное в метод число.
     */
    public double sqrt(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Negative number received : " + x);
        }
        return Math.sqrt(x);
    }

    /**
     * Допустим мы решили поздравлять каких то клиентов с днем рождения и сделали метод который возвращает сообщение с поздралением
     * Но мы должны убедиться что клиент и дата не null
     * <p>
     * При проверки клиента и даты бросать исключение IllegalArgumentException но с разными сообщениями
     * <p>
     * Клиент : Client object is null
     * Даты: Client birthdate is not correct
     * <p>
     * Если все данные корректны то вернуть сообщения типа : Dear firstName lastName, happy birthday to you!
     * <p>
     * Имя и фамилия всегда есть и корректны
     * <p>
     * Для удобствa используй статические методы Objects
     * И для вывода сообщения String.format
     */
    public String messageBirthdayGreetings(Client client) throws IllegalArgumentException {
        if (Objects.isNull(client)) {
            throw new IllegalArgumentException("Client object is null");
        }
        if (Objects.isNull(client.getBirthdate())) {
            throw new IllegalArgumentException("Client birthdate is not correct");
        }
        return String.format("Dear " + client.getFirstName() + " " + client.getLastName() + ", happy birthday to you!");
        // fixme example String.format("Dear %s .... , client.getFirstName() .... )
        //todo see https://www.baeldung.com/string/format
    }
}

