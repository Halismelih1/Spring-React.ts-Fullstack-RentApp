package com.example.Server.Dtos.Requests.Car;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AddCar {

    private int kilometer;
    private String plate;
    private LocalDate year;
    private Double dailyPrice;
}
