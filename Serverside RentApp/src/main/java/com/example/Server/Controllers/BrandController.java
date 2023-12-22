package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Brand.AddBrand;
import com.example.Server.Dtos.Requests.Brand.UpdateBrand;
import com.example.Server.Services.Abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/Brands")
public class BrandController {

    private final BrandService brandService;

    @PostMapping
    public void add(@RequestBody AddBrand brand){
        brandService.add(brand);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrand brand){
        brandService.update(brand);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        brandService.delete(id);
    }
}
