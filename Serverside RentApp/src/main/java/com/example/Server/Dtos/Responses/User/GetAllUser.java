package com.example.Server.Dtos.Responses.User;

import com.example.Server.Entities.Concretes.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class GetAllUser {
    private int id;
    private String username;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private List<Role> roles;
}
