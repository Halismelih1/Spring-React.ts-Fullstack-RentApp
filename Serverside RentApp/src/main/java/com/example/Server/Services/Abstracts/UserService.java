package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.User.AddUser;
import com.example.Server.Dtos.Requests.User.UpdateUser;
import com.example.Server.Dtos.Responses.User.GetAllUser;
import com.example.Server.Dtos.Responses.User.GetByIdUser;

import java.util.List;

public interface UserService {
    public void add(AddUser request);
    public void update(UpdateUser request,int id);
    public void delete(int id);
    public List<GetAllUser> getAll();
    public GetByIdUser getById(int id);
}
