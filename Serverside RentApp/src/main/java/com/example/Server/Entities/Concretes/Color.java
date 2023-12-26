package com.example.Server.Entities.Concretes;

import com.example.Server.Entities.Abstracts.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "colors")
public class Color extends BaseEntity {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "color")
    @JsonIgnore
    private List<Car> cars;

}
