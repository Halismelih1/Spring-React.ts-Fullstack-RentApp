package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

    boolean existsByName(String name);
    boolean existsById(int id);
}
