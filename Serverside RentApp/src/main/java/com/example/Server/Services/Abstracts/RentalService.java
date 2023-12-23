package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Rental.AddRental;
import com.example.Server.Dtos.Requests.Rental.UpdateRental;
import com.example.Server.Dtos.Responses.Rental.GetAllRental;
import com.example.Server.Dtos.Responses.Rental.GetByIdRental;

import java.util.List;

public interface RentalService {
    public void add(AddRental request);
    public void update(UpdateRental request,int id);
    public void delete(int id);
    public List<GetAllRental> getAll();
    public GetByIdRental getById(int id);
}
