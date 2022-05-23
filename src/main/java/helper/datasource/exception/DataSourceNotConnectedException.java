package helper.datasource.exception;

public class DataSourceNotConnectedException extends RuntimeException {

    public DataSourceNotConnectedException() {
        super("Data source not connection");
    }

}
