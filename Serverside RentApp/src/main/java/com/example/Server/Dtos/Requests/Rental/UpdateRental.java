package com.example.Server.Dtos.Requests.Rental;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UpdateRental {
    private LocalDate endDate;
    private int endKilometer;
    private LocalDate returnDate;
    private LocalDate startDate;
    private int startKilometer;
    private Double totalPrice;
    private int carId;
    private int userId;

}
