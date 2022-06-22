package helper.client;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthdate;
}
