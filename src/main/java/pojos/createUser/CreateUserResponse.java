package pojos.createUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse {
    private Integer id;
    private String username;
    private Boolean is_active;
    private Boolean is_staff;
    private Boolean is_superuser;
    private String last_login;
    private String created;
    private String updated;

}
