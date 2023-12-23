package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.User.AddUser;
import com.example.Server.Dtos.Requests.User.UpdateUser;
import com.example.Server.Dtos.Responses.User.GetAllUser;
import com.example.Server.Dtos.Responses.User.GetByIdUser;
import com.example.Server.Services.Abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

      @AllArgsConstructor
      @RestController
      @RequestMapping("/Users")
      public class UserController {


        private final UserService userService;

        @PostMapping
        public void add(@RequestBody AddUser request){
            userService.add(request);
        }

        @PutMapping("{id}")
        public void update(@RequestBody UpdateUser request, @PathVariable int id){
            userService.update(request,id);
        }

        @DeleteMapping("{id}")
        public void delete(@PathVariable int id){
            userService.delete(id);
        }

        @GetMapping
        public List<GetAllUser> getAll(){
            return userService.getAll();

        }

        @GetMapping("{id}")
        public GetByIdUser getById(@PathVariable int id){
            return userService.getById(id);
        }
    }

