package lesson_three.two;

import helper.client.Client;
import helper.datasource.DataSourceConnection;
import helper.datasource.DataSourceManager;
import helper.datasource.exception.ClientNotFoundException;
import helper.datasource.exception.DataSourceException;
import helper.datasource.exception.DataSourceNotConnectedException;
import lombok.SneakyThrows;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProcessingExceptionTest {

    @Spy
    private ProcessingException exception;

    @Mock
    private Client client;
    @Mock
    private DataSourceConnection connection;
    @Mock
    private DataSourceManager manager;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    @SneakyThrows
    public void testIsCaughtException() {
        doNothing().when(exception).doThrowException();

        assertThat(exception.isCaughtException())
                .isFalse();

        doThrow(new Exception()).when(exception).doThrowException();

        assertThat(exception.isCaughtException())
                .isTrue();

        doThrow(new RuntimeException()).when(exception).doThrowException();

        assertThat(exception.isCaughtException())
                .isTrue();
    }

    @Test
    public void testGetClient() {
        assertGetClient(false);

        assertGetClientException(false);
    }

    @Test
    public void testGetClientTryWithResource() {
        assertGetClient(true);

        assertGetClient_Exception(true);
    }


    // private

    void assertGetClientException(boolean tryWithResource) {
        assertGetClient_NotConnection(tryWithResource);
        assertGetClient_Exception(tryWithResource);
        assertGetClient_notFound(tryWithResource);

        if (tryWithResource) {
            assertGetClient_IllegalArgument();
        } else {
            assertGetClientTryWithResource_IllegalArgument();
        }
    }

    @SneakyThrows
    void assertGetClient_notFound(boolean tryWithResource) {
        mockDataSource(connection, null);

        assertThat(getClient(tryWithResource)).isNull();

        assertSystemLog("Client by id [1] not found");

        verify(manager).getConnection();
        verify(connection).getClient(1L);
        verify(connection).close();
    }

    @SneakyThrows
    void assertGetClient_Exception(boolean tryWithResource) {
        when(manager.getConnection()).thenThrow(new Exception("test"));

        assertThat(catchThrowableOfType(() -> getClient(tryWithResource),
                DataSourceException.class)).isNotNull()
                .hasMessage("test");

        verify(manager).getConnection();
        verifyNoMoreInteractions(connection);
        resetMock();
    }

    @SneakyThrows
    void assertGetClient_IllegalArgument() {
        assertThat(catchThrowableOfType(() -> exception.getClient(manager, -1L),
                IllegalArgumentException.class)).isNotNull();
    }

    @SneakyThrows
    void assertGetClientTryWithResource_IllegalArgument() {
        assertThat(catchThrowableOfType(() -> exception.getClientTryWithResource(manager, -1L),
                IllegalArgumentException.class)).isNotNull();
    }

    @SneakyThrows
    void assertGetClient_NotConnection(boolean tryWithResource) {
        mockDataSource(null, client);

        assertThat(getClient(tryWithResource)).isNull();

        assertSystemLog("Data source not connection");

        verify(manager).getConnection();
        verifyNoMoreInteractions(connection);
        resetMock();
    }

    @SneakyThrows
    void assertGetClient(boolean tryWithResource) {
        mockDataSource(connection, client);

        assertThat(getClient(tryWithResource)).isEqualTo(client);

        assertSystemLog("");

        verify(manager).getConnection();
        verify(connection).getClient(1L);
        verify(connection).close();

        resetMock();
    }

    @SneakyThrows
    void mockDataSource(DataSourceConnection conn, Client client) {
        if (conn != null) {
            doReturn(conn).when(manager).getConnection();
        } else {
            doThrow(new DataSourceNotConnectedException()).when(manager).getConnection();
        }

        if (client == null) {
            doThrow(new ClientNotFoundException()).when(connection).getClient(anyLong());
        } else {
            when(connection.getClient(anyLong())).thenReturn(client);
        }
    }

    Client getClient(boolean tryWithResource) {
        if (tryWithResource) {
            return exception.getClientTryWithResource(manager, 1L);
        }

        return exception.getClient(manager, 1L);
    }

    void resetMock() {
        reset(connection, manager, client);
    }

    void assertSystemLog(String log) {
        assertThat(systemOutRule.getLog()).contains(log);
        systemOutRule.clearLog();
    }

}