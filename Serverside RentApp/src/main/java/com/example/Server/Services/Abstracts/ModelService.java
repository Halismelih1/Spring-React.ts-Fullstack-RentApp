package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Model.AddModel;
import com.example.Server.Dtos.Requests.Model.UpdateModel;
import com.example.Server.Dtos.Responses.Model.GetAllModel;
import com.example.Server.Dtos.Responses.Model.GetByIdModel;

import java.util.List;

public interface ModelService {
    public void add(AddModel request);
    public void update(UpdateModel request,int id);
    public void delete(int id);
    public List<GetAllModel> getAll();
    public GetByIdModel getById(int id);
}
