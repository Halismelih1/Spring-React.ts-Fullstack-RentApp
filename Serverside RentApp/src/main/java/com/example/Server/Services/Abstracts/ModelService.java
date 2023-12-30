package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Model.AddModel;
import com.example.Server.Dtos.Requests.Model.UpdateModel;
import com.example.Server.Dtos.Responses.Model.GetAllModel;
import com.example.Server.Dtos.Responses.Model.GetByIdModel;

import java.util.List;

public interface ModelService {
     void add(AddModel request);
     void update(UpdateModel request,int id);
     void delete(int id);
     List<GetAllModel> getAll();
     GetByIdModel getById(int id);

}
