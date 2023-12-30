package com.example.Server.Rules.Car;

import com.example.Server.Repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarBusinessRulesManager implements CarBusinessRulesService{

    private final CarRepository carRepository;
    @Override
    public void checkIfByIdExists(int id) {
        if (!carRepository.existsById(id)){
            throw new IllegalStateException("carId is not found !");
        }
    }

    @Override
    public void checkIfByPlateExists(String plate) {
        if (carRepository.existsByPlate(plate.trim())){
            throw new IllegalStateException("Plate is already exists!");

        }
    }

}
