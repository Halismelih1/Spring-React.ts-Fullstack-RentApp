package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
    boolean existsById(int id);

}
