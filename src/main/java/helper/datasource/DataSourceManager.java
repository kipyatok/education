package helper.datasource;

public interface DataSourceManager {

    DataSourceConnection getConnection() throws Exception; // NOSONAR
}
