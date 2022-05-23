package lesson_three.one;

import helper.client.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;

@RunWith(MockitoJUnitRunner.class)
public class LessonExceptionTest {

    @Spy
    @InjectMocks
    private LessonException exception;

    @Test
    public void testThrowException() {
        assertThat(catchThrowableOfType(() -> exception.testThrowException(),
                Exception.class)).isNotNull()
                .isNotInstanceOf(RuntimeException.class)
                .hasMessage("Могу же!");
    }

    @Test
    public void testSqrt() {
        assertThat(exception.sqrt(16))
                .isEqualTo(4);

        assertThat(catchThrowableOfType(() -> exception.sqrt(-1),
                IllegalArgumentException.class))
                .isNotNull()
                .hasMessage("Negative number received : -1.0");
    }

    @Test
    public void testBirthdayGreetings() {
        assertThat(exception.messageBirthdayGreetings(
                Client.builder()
                        .firstName("Ivan")
                        .lastName("Ivanov")
                        .birthdate(new Date())
                        .build()))
                .isNotNull()
                .isNotEmpty()
                .isNotBlank()
                .isEqualTo("Dear Ivan Ivanov, happy birthday to you!");

        assertThat(catchThrowableOfType(() -> exception.messageBirthdayGreetings(null),
                IllegalArgumentException.class))
                .isNotNull()
                .hasMessage("Client object is null");

        assertThat(catchThrowableOfType(() -> exception.messageBirthdayGreetings(Client.builder().build()),
                IllegalArgumentException.class))
                .isNotNull()
                .hasMessage("Client birthdate is not correct");
    }
}