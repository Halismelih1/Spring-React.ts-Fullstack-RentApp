package com.example.Server.Dtos.Responses.Rental;

import com.example.Server.Dtos.Responses.Car.GetByIdCar;
import com.example.Server.Dtos.Responses.User.GetByIdUser;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GetAllRental {
    private int id;
    private LocalDate endDate;
    private int kilometer;
    private LocalDate returnDate;
    private LocalDate startDate;
    private int startKilometer;
    private Double totalPrice;
    private GetByIdCar car;
    private GetByIdUser user;
}
