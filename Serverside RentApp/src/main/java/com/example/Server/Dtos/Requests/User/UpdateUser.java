package com.example.Server.Dtos.Requests.User;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateUser {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;


}
