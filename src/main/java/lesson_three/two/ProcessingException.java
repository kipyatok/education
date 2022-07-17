package lesson_three.two;

import helper.client.Client;
import helper.datasource.DataSourceManager;

/**
 * Данный класc научит бросать исключения и обрабатывать их
 */
public class ProcessingException {

    /**
     * Реализовать метод который вызывает внутренний метод doThrowException
     * и будет отлавливать все исключения и возвращать true если поймал
     * иначе false
     */

    public boolean isCaughtException() {
        return true;
    }

    /**
     * Задача на реализацию обработки несколько исключений!
     * В данной задаче нужно реализовать без try-with-resource
     * <p>
     * Мы используем некоторую базу данных которая выдает клиентов и может бросить исключения и их надо обработать
     * <p>
     * При подключении или получении всегда что то может пойти не так
     * и нам надо проработать все возможные варианты
     * <p>
     * 1. Ид клиента всегда положительное, если нет то сразу бросаем IllegalArgument
     * 2. При подключении к базе данных может произойти ошибка подключения (DataSourceNotConnectionException) или любая неизвестная (как пример Exception, RuntimeException)
     * При не подключении вывести на экран сообщение ошибки и вернуть null
     * При любой другой бросить исключение DataSourceException с текстом ошибки которую поймали
     * 3. Если все хорошо подключились, то ищем клиента по ид, но так же надо рассмотреть вариант что клиент не нашелся (ClientNotFoundException)
     * Если такого клиента нету, то вывести на экран сообщение "Client by id [?] not found" за место знака вопроса ид клиента
     * 4. Если подключение было до оно должно и закрыться
     * Смотри интерфейся Closable и AutoClosable
     * <p>
     * Примеры наверно проще посмотреть по тестам
     * <p>
     * DataSourceManager всегда есть и его не надо проверять на null
     */
    public Client getClient(DataSourceManager manager, long id) {
        // You code
        return null;
    }

    /**
     * Тоже самое что и выше но с использование try-with-resource
     * <p>
     * На дуплирование кода не обращать внимания, тут больше работа с исключениями
     */

    public Client getClientTryWithResource(DataSourceManager manager, long id) {
        // You code
        return null;
    }

    //todo used to testing, not implement
    void doThrowException() throws Exception {
    } // NOSONAR
}
