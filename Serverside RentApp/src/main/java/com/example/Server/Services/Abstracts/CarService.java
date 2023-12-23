package com.example.Server.Services.Abstracts;
import com.example.Server.Dtos.Requests.Car.AddCar;
import com.example.Server.Dtos.Requests.Car.UpdateCar;
import com.example.Server.Dtos.Responses.Car.GetAllCar;
import com.example.Server.Dtos.Responses.Car.GetByIdCar;

import java.util.List;

public interface CarService {
    public void add(AddCar request);
    public void update(UpdateCar request,int id);
    public void delete(int id);
    public List<GetAllCar> getAll();
    public GetByIdCar getById(int id);


}
