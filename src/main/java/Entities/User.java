package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
}
