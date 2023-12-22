package com.example.Server.Dtos.Responses.Model;

import com.example.Server.Dtos.Responses.Brand.GetByIdBrand;
import lombok.Data;

@Data
public class GetByIdModel {
    private int id;
    private String name;
    private GetByIdBrand brand;

}
