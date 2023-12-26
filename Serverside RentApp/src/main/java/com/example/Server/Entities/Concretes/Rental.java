package com.example.Server.Entities.Concretes;

import com.example.Server.Entities.Abstracts.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@Table(name = "rentals")
public class Rental extends BaseEntity {

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "start_kilometer")
    private int startKilometer;

    @Column(name = "end_kilometer")
    private Integer endKilometer;

    @Column(name = "total_price")
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "rental")
    @JsonIgnore
    private List<Invoice> invoices;

}
