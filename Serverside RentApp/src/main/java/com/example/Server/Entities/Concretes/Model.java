package com.example.Server.Entities.Concretes;

import com.example.Server.Entities.Abstracts.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "models")
public class Model extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Car> cars;

}
