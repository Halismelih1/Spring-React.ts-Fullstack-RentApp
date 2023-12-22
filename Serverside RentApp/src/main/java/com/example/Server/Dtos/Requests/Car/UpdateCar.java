package com.example.Server.Dtos.Requests.Car;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateCar {
    private int id;
    private int kilometer;
    private String plate;
    private LocalDate year;
    private Double dailyPrice;
    private int colorId;
    private int modelId;
}
