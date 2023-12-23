package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Car.AddCar;
import com.example.Server.Dtos.Requests.Car.UpdateCar;
import com.example.Server.Dtos.Responses.Car.GetAllCar;
import com.example.Server.Dtos.Responses.Car.GetByIdCar;
import com.example.Server.Entities.Car;
import com.example.Server.Entities.Color;
import com.example.Server.Repositories.CarRepository;
import com.example.Server.Services.Abstracts.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public void add( AddCar request) {
        Car car = modelMapperService.dtoToEntity().map(request,Car.class);
        carRepository.save(car);

    }

    @Override
    public void update(UpdateCar request, int id) {
        Car car = carRepository.findById(id).orElseThrow();
        modelMapperService.dtoToEntity().map(request, car);
        carRepository.save(car);

    }

    @Override
    public void delete( int id) {
        carRepository.deleteById(id);

    }

    @Override
    public List<GetAllCar> getAll() {
        List<Car> cars = carRepository.findAll();
        List<GetAllCar> response = cars.stream().map
                (car -> modelMapperService.entityToDto()
                        .map(car,GetAllCar.class)).toList();
        return response;
    }

    @Override
    public GetByIdCar getById(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        GetByIdCar response = modelMapperService.entityToDto().map(car,GetByIdCar.class);
        return response;
    }
}
