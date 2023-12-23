package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Color.AddColor;
import com.example.Server.Dtos.Requests.Color.UpdateColor;
import com.example.Server.Dtos.Responses.Color.GetAllColor;
import com.example.Server.Dtos.Responses.Color.GetByIdColor;

import java.util.List;

public interface ColorService {
     void add(AddColor request);
     void update(UpdateColor request, int id);
     void delete(int id);
     List<GetAllColor> getAll();
     GetByIdColor getById(int id);


}
