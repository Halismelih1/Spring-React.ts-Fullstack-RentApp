package com.example.Server.Repositories;

import com.example.Server.Entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color,Integer> {
}
