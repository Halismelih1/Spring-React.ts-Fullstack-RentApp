package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.User.AddUser;
import com.example.Server.Dtos.Requests.User.UpdateUser;
import com.example.Server.Dtos.Responses.User.GetAllUser;
import com.example.Server.Dtos.Responses.User.GetByIdUser;
import com.example.Server.Entities.Concretes.User;
import com.example.Server.Repositories.UserRepository;
import com.example.Server.Services.Abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddUser request) {
        User user = modelMapperService.dtoToEntity().map(request,User.class);
        userRepository.save(user);

    }

    @Override
    public void update(UpdateUser request, int id) {
        User existingUser = userRepository.findById(id).orElseThrow();
        User updatedUser = modelMapperService.dtoToEntity().map(request, User.class);
        updatedUser.setId(existingUser.getId());
        userRepository.save(updatedUser);

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<GetAllUser> getAll() {
        List <User> users = userRepository.findAll();
        List<GetAllUser> response = users.stream().map(user -> modelMapperService.entityToDto().map(user,GetAllUser.class)).toList();
        return response;
    }

    @Override
    public GetByIdUser getById(int id) {
        User user = userRepository.findById(id).orElseThrow();
        GetByIdUser response = modelMapperService.entityToDto().map(user,GetByIdUser.class);
        return response;
    }

    @Override
    public boolean existsById(int id) {
        return userRepository.existsById(id);
    }
}
