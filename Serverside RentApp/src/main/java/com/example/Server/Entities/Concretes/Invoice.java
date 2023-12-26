package com.example.Server.Entities.Concretes;

import com.example.Server.Entities.Abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "invoices")
public class Invoice extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;
}
