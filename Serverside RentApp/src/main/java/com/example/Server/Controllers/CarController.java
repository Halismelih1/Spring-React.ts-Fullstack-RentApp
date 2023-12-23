package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Brand.UpdateBrand;
import com.example.Server.Dtos.Requests.Car.AddCar;
import com.example.Server.Dtos.Requests.Car.UpdateCar;
import com.example.Server.Dtos.Responses.Car.GetAllCar;
import com.example.Server.Dtos.Responses.Car.GetByIdCar;
import com.example.Server.Services.Abstracts.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Cars")
public class CarController {

    private final CarService carService;

    @PostMapping
    public void add(@RequestBody AddCar request){
        carService.add(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateCar request,@PathVariable int id){
        carService.update(request,id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        carService.delete(id);
    }

    @GetMapping
    public List<GetAllCar> getAll(){
       return carService.getAll();

    }

    @GetMapping("{id}")
    public GetByIdCar getById(@PathVariable int id){
        return carService.getById(id);
    }
}
