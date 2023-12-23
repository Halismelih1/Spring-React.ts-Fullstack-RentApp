package com.example.Server.Dtos.Responses.Car;

import com.example.Server.Dtos.Responses.Color.GetByIdColor;
import com.example.Server.Dtos.Responses.Model.GetByIdModel;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GetAllCar {
    private int id;
    private int kilometer;
    private String plate;
    private int year;
    private Double dailyPrice;
    private GetByIdColor color;
    private GetByIdModel model;

}
