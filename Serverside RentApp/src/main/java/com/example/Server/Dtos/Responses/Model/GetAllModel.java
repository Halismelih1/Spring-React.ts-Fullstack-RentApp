package com.example.Server.Dtos.Responses.Model;

import com.example.Server.Dtos.Responses.Brand.GetByIdBrand;
import com.example.Server.Dtos.Responses.Color.GetByIdColor;
import lombok.Data;

@Data
public class GetAllModel {
    private int id;
    private String name;
    private GetByIdBrand brand;
}
