package com.example.Server.Rules.Brand;

import com.example.Server.Repositories.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRulesManager implements BrandBusinessRulesService {

    private final BrandRepository brandRepository;

    @Override
    public void checkIfBrandNameExists(String name) {
       if(brandRepository.existsByName(name)){
           throw new IllegalStateException("Brand name is already exists!");
       }
    }

    @Override
    public void checkIfByIdExists(int id) {
        if (!brandRepository.existsById(id)) {
            throw new IllegalStateException("BrandId not found!");

        }
    }
}
