package com.example.Server.Rules.Invoice;

import com.example.Server.Repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class InvoiceBusinessRulesManager implements InvoiceBusinessRulesService{

    private final InvoiceRepository invoiceRepository;

    @Override
    public void checkIfByIdExists(int id) {
        if(!invoiceRepository.existsById(id)){
            throw new IllegalStateException("Invoice Id is not found !");
        }
    }
}
