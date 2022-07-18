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
        boolean check = false; //fixme remove
        try {
            doThrowException();
            // fixme add return
        } catch (Exception e) {
            check = true; // fixme return at once
        }
        return check; //fixme remove
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
    public Client getClient(DataSourceManager manager, long id) { // fixme ReformatCode
        if (id < 0) {
            throw new IllegalArgumentException();
        }

        DataSourceConnection connection = null;
        try {
            connection = manager.getConnection();
            //fixme add return client
        } catch (DataSourceNotConnectedException e){
            System.out.println(e.getMessage());
            return null; // fixme remove
        }catch (Exception b){
            throw new DataSourceException(b.getMessage());
        } // fixme add catch ClientNotFoundException

        //fixme remove block code from
        Client client = null;
        try{
            client = connection.getClient(id);
        }catch (ClientNotFoundException c){ // fixme move
            System.out.println("Client by id [" + id + "] not found");
        }finally { // fixme move to line code 68
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }// fixme to
        return client; //fixme return null
    }

    /**
     * Тоже самое что и выше но с использование try-with-resource
     * <p>
     * На дуплирование кода не обращать внимания, тут больше работа с исключениями
     */

    public Client getClientTryWithResource(DataSourceManager manager, long id) {
        Client client = null; // fixme remove
        try (DataSourceConnection connection = manager.getConnection()) {
            if (id < 0){
                throw new IllegalArgumentException();
            }
            client = connection.getClient(id); // fixme return at once
        } catch (DataSourceNotConnectedException d) {
            d.printStackTrace();
            return null;
        }catch (Exception e) {
            throw new DataSourceException(e.getMessage());
        }
        return client; // fixme return null
    }

    //todo used to testing, not implement
    void doThrowException() throws Exception {
    } // NOSONAR
}
// fixme remove comments
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