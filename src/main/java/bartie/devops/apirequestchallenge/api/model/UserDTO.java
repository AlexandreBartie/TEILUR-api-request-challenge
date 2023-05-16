package bartie.devops.apirequestchallenge.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class UserDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public String fullKey()
    { return firstName.trim() + " " + lastName.trim() + " " + email.trim()  ; } 
}
