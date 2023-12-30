package com.example.Server.Rules.Rental;

import com.example.Server.Repositories.RentalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class RentalBusinessRulesManager implements RentalBusinessRulesService{

    private final RentalRepository rentalRepository;
    @Override
    public void checkIfByIdExists(int id) {
        if(!rentalRepository.existsById(id)){
            throw new IllegalStateException("Rental Id is not found !");
        }
    }
}
