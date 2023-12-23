package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Rental.AddRental;
import com.example.Server.Dtos.Requests.Rental.UpdateRental;
import com.example.Server.Dtos.Responses.Rental.GetAllRental;
import com.example.Server.Dtos.Responses.Rental.GetByIdRental;
import com.example.Server.Services.Abstracts.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/Rentals")
public class RentalController {

    private final RentalService rentalService;

    @PostMapping
    public void add(@RequestBody AddRental request){
        rentalService.add(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateRental request, @PathVariable int id){
        rentalService.update(request,id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        rentalService.delete(id);
    }

    @GetMapping
    public List<GetAllRental> getAll(){
        return rentalService.getAll();

    }

    @GetMapping("{id}")
    public GetByIdRental getById(@PathVariable int id){
        return rentalService.getById(id);
    }
}



