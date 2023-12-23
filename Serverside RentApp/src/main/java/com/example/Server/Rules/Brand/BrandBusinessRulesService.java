package com.example.Server.Rules.Brand;

public interface BrandBusinessRulesService {

    void checkIfBrandNameExists(String name);
    void checkIfByIdExists (int id);

}
