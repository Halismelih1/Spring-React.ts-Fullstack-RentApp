package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Rental.AddRental;
import com.example.Server.Dtos.Requests.Rental.UpdateRental;
import com.example.Server.Dtos.Responses.Rental.GetAllRental;
import com.example.Server.Dtos.Responses.Rental.GetByIdRental;

import java.util.List;

public interface RentalService {
     void add(AddRental request);
     void update(UpdateRental request,int id);
     void delete(int id);
     List<GetAllRental> getAll();
     GetByIdRental getById(int id);

}
