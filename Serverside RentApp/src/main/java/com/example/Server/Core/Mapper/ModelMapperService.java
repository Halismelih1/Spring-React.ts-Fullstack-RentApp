package com.example.Server.Core.Mapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper entityToDto();
    ModelMapper dtoToEntity();
}
