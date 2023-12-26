package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
    boolean existsById(int id);

}
