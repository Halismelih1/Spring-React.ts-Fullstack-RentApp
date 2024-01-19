package com.example.Server.Dtos.Requests.User;

import com.example.Server.Entities.Concretes.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUser {
    private String username;
    private String surname;
    private String email;
    private String password;
    private LocalDate birthDate;
    private List<Role> roles;
}
