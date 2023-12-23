package com.example.Server.Services.Abstracts;
import com.example.Server.Dtos.Requests.Car.AddCar;
import com.example.Server.Dtos.Requests.Car.UpdateCar;
import com.example.Server.Dtos.Responses.Car.GetAllCar;
import com.example.Server.Dtos.Responses.Car.GetByIdCar;

import java.util.List;

public interface CarService {
     void add(AddCar request);
     void update(UpdateCar request,int id);
     void delete(int id);
     List<GetAllCar> getAll();
     GetByIdCar getById(int id);


}
