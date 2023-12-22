package com.example.Server.Dtos.Responses.Rental;

import lombok.Data;

import java.time.LocalDate;
@Data
public class GetByIdRental {
    private int id;
    private LocalDate endDate;
    private int kilometer;
    private LocalDate returnDate;
    private LocalDate startDate;
    private int startKilometer;
    private Double totalPrice;
}
