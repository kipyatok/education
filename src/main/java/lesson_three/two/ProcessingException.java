package lesson_three.two;

import helper.client.Client;
import helper.datasource.DataSourceConnection;
import helper.datasource.DataSourceManager;
import helper.datasource.exception.ClientNotFoundException;
import helper.datasource.exception.DataSourceException;
import helper.datasource.exception.DataSourceNotConnectedException;

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
        boolean check = false;
        try {
            doThrowException();
        } catch (Exception e) {
            check = true;
        }
        return check;
    }

    /**
     * Задача на реализацию обработки несколько исключений!
     * В данной задаче нужно реализовать без try-with-resource
     * <p>
     * Мы используем некоторую базу данных которая выдает клиентов и может бросить исключения и их надо обработать
     * <p>
     * При подключении или полученииб всегда что то может пойти не так
     * и нам надо проработать все возможные варианты
     * <p>
     * 1. Ид клиента всегда положительное, если нет то сразу бросаем IllegalArgument
     * 2. При подключении к базе данных может произойти ошибка подключения (DataSourceNotFound) или любая неизвестная
     * При не подключении вывести на экран сообщение ошибки и вернуть null
     * При любой другой бросить исключение DataSourceException с текстом ошибки которуб поймали
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
        if (id < 0) {
            throw new IllegalArgumentException();
        }

        DataSourceConnection connection = null;
        try {
            connection = manager.getConnection();
        } catch (DataSourceNotConnectedException e){
            e.printStackTrace();
            return null;
        }catch (Exception b){
            throw new DataSourceException(b.getMessage());
        }

        Client client = null;
        try{
            client = connection.getClient(id);
        }catch (ClientNotFoundException c){
            System.out.println("Client by id [" + id + "] not found");
        }finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return client;
    }

    /**
     * Тоже самое что и выше но с использование try-with-resource
     * <p>
     * На дуплирование кода не обращать внимания, тут больше работа с исключениями
     */

    public Client getClientTryWithResource(DataSourceManager manager, long id) {
        Client client = null;
        try (DataSourceConnection connection = manager.getConnection()) {
            if (id < 0){
                throw new IllegalArgumentException();
            }
            client = connection.getClient(id);
        } catch (DataSourceNotConnectedException d) {
            d.printStackTrace();
            return null;
        }catch (Exception e) {
            throw new DataSourceException(e.getMessage());
        }
        return client;
    }

    // used to testing, not implement

    void doThrowException() throws Exception {
    } // NOSONAR
}

/*
        if (id < 0) {
        throw new IllegalArgumentException();
        }

        Client client = new Client();

        DataSourceConnection connection = null;

        try {
        connection = manager.getConnection();
        client = connection.getClient(id);
        } catch (DataSourceNotConnectedException e) {
        e.printStackTrace();
        return null;
        } catch (ClientNotFoundException a) {
        System.out.println("Client by id [" + id + "] not found");
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
        try {
        connection.close();
        } catch (Exception e) {
        e.printStackTrace();
        }

        }
        return client;

        */