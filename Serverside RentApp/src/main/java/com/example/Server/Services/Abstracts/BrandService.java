package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Brand.AddBrand;
import com.example.Server.Dtos.Requests.Brand.UpdateBrand;
import com.example.Server.Dtos.Responses.Brand.GetAllBrand;
import com.example.Server.Dtos.Responses.Brand.GetByIdBrand;

import java.util.List;

public interface BrandService {
     void add(AddBrand request);
     void update(UpdateBrand request,int id);
     void delete(int id);
    List<GetAllBrand> getAll();
    GetByIdBrand getById(int id);
}
