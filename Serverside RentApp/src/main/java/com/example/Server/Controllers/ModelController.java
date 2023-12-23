package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Model.AddModel;
import com.example.Server.Dtos.Requests.Model.UpdateModel;
import com.example.Server.Dtos.Responses.Model.GetAllModel;
import com.example.Server.Dtos.Responses.Model.GetByIdModel;
import com.example.Server.Services.Abstracts.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Models")
public class ModelController {

    private ModelService modelService;

    @PostMapping
    public void add(@RequestBody AddModel model){
        modelService.add(model);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateModel request, @PathVariable int id){
        modelService.update(request,id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        modelService.delete(id);
    }

    @GetMapping
    public List<GetAllModel> getAll(){
        return modelService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdModel getById(@PathVariable int id){
       return modelService.getById(id);
    }
}
