package com.example.Server.Entities.Concretes;

import com.example.Server.Entities.Abstracts.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cars")
public class Car extends BaseEntity {

    @Column(name = "kilometer")
    private int kilometer;

    @Column(name = "plate")
    private String plate;

    @Column(name = "year")
    private int year;

    @Column(name = "daily_price")
    private double dailyPrice;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private List<Rental> rentals;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
