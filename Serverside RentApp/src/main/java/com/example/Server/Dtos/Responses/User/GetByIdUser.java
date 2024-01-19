package com.example.Server.Dtos.Responses.User;

import com.example.Server.Entities.Concretes.Role;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class GetByIdUser {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDate birthDate;
    private List<Role> roles;
}
