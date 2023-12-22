package com.example.Server.Dtos.Responses.User;

import lombok.Data;
import java.time.LocalDate;
@Data
public class GetByIdUser {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
}
