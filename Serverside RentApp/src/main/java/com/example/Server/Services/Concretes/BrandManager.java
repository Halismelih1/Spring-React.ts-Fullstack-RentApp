package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Brand.AddBrand;
import com.example.Server.Dtos.Requests.Brand.UpdateBrand;
import com.example.Server.Dtos.Responses.Brand.GetAllBrand;
import com.example.Server.Dtos.Responses.Brand.GetByIdBrand;
import com.example.Server.Entities.Concretes.Brand;
import com.example.Server.Repositories.BrandRepository;
import com.example.Server.Rules.Brand.BrandBusinessRulesService;
import com.example.Server.Services.Abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;
    private final ModelMapperService modelMapperService;
    private final BrandBusinessRulesService brandBusinessRulesService;

    @Override
    public void add( AddBrand request) {
        brandBusinessRulesService.checkIfBrandNameExists(request.getName());
        Brand brand = modelMapperService.dtoToEntity().map(request,Brand.class);
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrand request,int id) {
        brandBusinessRulesService.checkIfByIdExists(id);
        Brand brand = brandRepository.findById(id).orElseThrow();
        modelMapperService.dtoToEntity().map(request, brand);
        brandRepository.save(brand);

    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);
    }

    @Override
    public List<GetAllBrand> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrand> brandResponses = brands.stream()
                .map(brand -> modelMapperService.entityToDto().map(brand, GetAllBrand.class)).toList();
        return brandResponses;
    }

    @Override
    public GetByIdBrand getById( int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();
        GetByIdBrand response = modelMapperService.entityToDto().map(brand, GetByIdBrand.class);
        return response;
    }

    @Override
    public boolean existsById(int id) {
        return brandRepository.existsById(id);
    }
}
