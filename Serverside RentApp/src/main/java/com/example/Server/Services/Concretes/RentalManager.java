package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Rental.AddRental;
import com.example.Server.Dtos.Requests.Rental.UpdateRental;
import com.example.Server.Dtos.Responses.Rental.GetAllRental;
import com.example.Server.Dtos.Responses.Rental.GetByIdRental;
import com.example.Server.Entities.Concretes.Rental;
import com.example.Server.Repositories.RentalRepository;
import com.example.Server.Services.Abstracts.RentalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RentalManager implements RentalService {

    private final RentalRepository rentalRepository;
    private final ModelMapperService modelMapperService;


    @Override
    public void add(AddRental request) {
        Rental rental = modelMapperService.entityToDto().map(request,Rental.class);
        rentalRepository.save(rental);
    }

    @Override
    public void update(UpdateRental request, int id) {
        Rental existingRental = rentalRepository.findById(id).orElseThrow();
        Rental updatedRental = modelMapperService.dtoToEntity().map(request, Rental.class);
        updatedRental.setId(existingRental.getId());
        rentalRepository.save(updatedRental);

    }

    @Override
    public void delete(int id) {
        rentalRepository.deleteById(id);
    }

    @Override
    public List<GetAllRental> getAll() {
         List<Rental> rentals = rentalRepository.findAll();
         List<GetAllRental> response = rentals.stream().map(rental -> modelMapperService.entityToDto().map(rental,GetAllRental.class)).toList();
         return response;
    }

    @Override
    public GetByIdRental getById(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetByIdRental response = modelMapperService.entityToDto().map(rental,GetByIdRental.class);
        return response;
    }

    @Override
    public boolean existsById(int id) {
        return rentalRepository.existsById(id);
    }
}
