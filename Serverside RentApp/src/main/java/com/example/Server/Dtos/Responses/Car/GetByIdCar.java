package com.example.Server.Dtos.Responses.Car;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GetByIdCar {
    private int id;
    private int kilometer;
    private String plate;
    private LocalDate year;
    private Double dailyPrice;
}
