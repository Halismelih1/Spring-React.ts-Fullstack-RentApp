package com.example.Server.Repositories;

import com.example.Server.Entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
