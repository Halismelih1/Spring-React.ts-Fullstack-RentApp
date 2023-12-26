package com.example.Server.Repositories;

import com.example.Server.Entities.Concretes.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
    boolean existsById(int id);

}
