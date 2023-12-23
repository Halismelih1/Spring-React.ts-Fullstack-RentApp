package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Model.AddModel;
import com.example.Server.Dtos.Requests.Model.UpdateModel;
import com.example.Server.Dtos.Responses.Model.GetAllModel;
import com.example.Server.Dtos.Responses.Model.GetByIdModel;
import com.example.Server.Entities.Model;
import com.example.Server.Repositories.ModelRepository;
import com.example.Server.Services.Abstracts.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;
    private final ModelMapperService modelMapperService;


    @Override
    public void add( AddModel request) {
       Model model = modelMapperService.dtoToEntity().map(request, Model.class);
       modelRepository.save(model);
    }

    @Override
    public void update( UpdateModel request, int id) {
        Model existingModel = modelRepository.findById(id).orElseThrow();
        Model updatedModel = modelMapperService.dtoToEntity().map(request, Model.class);
        updatedModel.setId(existingModel.getId());
        modelRepository.save(updatedModel);

    }

    @Override
    public void delete(int id) {
        modelRepository.deleteById(id);

    }

    @Override
    public List<GetAllModel> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModel> response = models.stream().map(model -> modelMapperService.entityToDto().map(model,GetAllModel.class)).toList();
        return response;
    }

    @Override
    public GetByIdModel getById( int id) {
        Model model = modelRepository.findById(id).orElseThrow();
        GetByIdModel response = modelMapperService.entityToDto().map(model,GetByIdModel.class);
        return response;
    }
}
