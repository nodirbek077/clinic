package uz.nanotechsolutions.clinic.payload.request;

import lombok.Data;
import uz.nanotechsolutions.clinic.entity.enums.Role;

@Data
public class UserRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;
}
