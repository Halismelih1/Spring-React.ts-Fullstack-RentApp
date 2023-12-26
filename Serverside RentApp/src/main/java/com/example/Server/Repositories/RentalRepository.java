package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental,Integer> {
    boolean existsById(int id);

}
