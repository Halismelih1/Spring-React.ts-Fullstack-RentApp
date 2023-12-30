package com.example.Server.Entities.Abstracts;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "created_date", updatable = false)
    //@Temporal(TemporalType.DATE) //Zamanı Time ve Date şeklinde ayrı ayrı almak için ileride kullanılabilir.
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @PrePersist
    private void beforeAdd() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = Timestamp.valueOf(now);
    }

    @PreUpdate
    private void beforeUpdate() {
        LocalDateTime now = LocalDateTime.now();
        updatedDate = Timestamp.valueOf(now);

    }

}
