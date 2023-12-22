package com.example.Server.Repositories;

import com.example.Server.Entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental,Integer> {
}
