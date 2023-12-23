package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Color.AddColor;
import com.example.Server.Dtos.Requests.Color.UpdateColor;
import com.example.Server.Dtos.Responses.Color.GetAllColor;
import com.example.Server.Dtos.Responses.Color.GetByIdColor;

import java.util.List;

public interface ColorService {
    public void add(AddColor request);
    public void update(UpdateColor request, int id);
    public void delete(int id);
    public List<GetAllColor> getAll();
    public GetByIdColor getById(int id);


}
