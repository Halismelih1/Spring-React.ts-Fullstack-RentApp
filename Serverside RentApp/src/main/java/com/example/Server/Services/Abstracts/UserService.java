package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.User.AddUser;
import com.example.Server.Dtos.Requests.User.UpdateUser;
import com.example.Server.Dtos.Responses.User.GetAllUser;
import com.example.Server.Dtos.Responses.User.GetByIdUser;

import java.util.List;

public interface UserService {
     void add(AddUser request);
     void update(UpdateUser request,int id);
     void delete(int id);
     List<GetAllUser> getAll();
     GetByIdUser getById(int id);
}
