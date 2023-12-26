package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsById(int id);

}
