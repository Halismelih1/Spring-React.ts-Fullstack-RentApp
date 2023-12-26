package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Color.AddColor;
import com.example.Server.Dtos.Requests.Color.UpdateColor;
import com.example.Server.Dtos.Responses.Color.GetAllColor;
import com.example.Server.Dtos.Responses.Color.GetByIdColor;
import com.example.Server.Entities.Concretes.Color;
import com.example.Server.Repositories.ColorRepository;
import com.example.Server.Services.Abstracts.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ColorManager implements ColorService {

    private final ColorRepository colorRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddColor request) {
        Color color = modelMapperService.dtoToEntity().map(request,Color.class);
        colorRepository.save(color);
    }

    @Override
    public void update(UpdateColor request,int id) {
        Color color = colorRepository.findById(id).orElseThrow();
        modelMapperService.dtoToEntity().map(request, color);
        colorRepository.save(color);
    }

    @Override
    public void delete( int id) {
        colorRepository.deleteById(id);
    }

    @Override
    public List<GetAllColor> getAll() {
        List<Color> colors = colorRepository.findAll();
        List<GetAllColor> response = colors.stream().map(color -> modelMapperService.entityToDto().map(color,GetAllColor.class)).toList();
        return response;
    }

    @Override
    public GetByIdColor getById(int id) {
        Color color = colorRepository.findById(id).orElseThrow();
        GetByIdColor response = modelMapperService.entityToDto().map(color,GetByIdColor.class);
        return response;
    }

    @Override
    public boolean existsById(int id) {
        return colorRepository.existsById(id);
    }
}
