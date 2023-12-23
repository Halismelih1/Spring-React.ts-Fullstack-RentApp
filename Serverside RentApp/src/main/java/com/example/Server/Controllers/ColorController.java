package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Color.AddColor;
import com.example.Server.Dtos.Requests.Color.UpdateColor;
import com.example.Server.Dtos.Responses.Color.GetAllColor;
import com.example.Server.Dtos.Responses.Color.GetByIdColor;
import com.example.Server.Services.Abstracts.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Colors")
public class ColorController {

    private final ColorService colorService;

    @PostMapping
    public void add(@RequestBody AddColor request){
        colorService.add(request);
    }
    @PutMapping("{id}")
    public void update(@RequestBody UpdateColor request,@PathVariable int id){
        colorService.update(request,id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        colorService.delete(id);
    }
    @GetMapping
    public List<GetAllColor> getAll(){
        return colorService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdColor getById(@PathVariable int id){
        return colorService.getById(id);
    }

}
