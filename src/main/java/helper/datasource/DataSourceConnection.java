package helper.datasource;

import helper.client.Client;

public interface DataSourceConnection extends AutoCloseable {
    Client getClient(long id);

    @Override
    void close() throws Exception;
}
