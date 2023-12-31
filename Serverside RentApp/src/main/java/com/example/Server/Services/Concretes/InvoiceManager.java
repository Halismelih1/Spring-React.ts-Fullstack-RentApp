package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Invoice.AddInvoice;
import com.example.Server.Dtos.Requests.Invoice.UpdateInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetAllInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetByIdInvoice;
import com.example.Server.Entities.Concretes.Invoice;
import com.example.Server.Repositories.InvoiceRepository;
import com.example.Server.Rules.Invoice.InvoiceBusinessRulesService;
import com.example.Server.Rules.Rental.RentalBusinessRulesService;
import com.example.Server.Services.Abstracts.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InvoiceManager implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final ModelMapperService modelMapperService;
    private final RentalBusinessRulesService rentalBusinessRulesService;
    private final InvoiceBusinessRulesService invoiceBusinessRulesService;


    @Override
    public void add(AddInvoice request) {
        rentalBusinessRulesService.checkIfByIdExists(request.getRentalId());
       Invoice invoice = modelMapperService.dtoToEntity().map(request, Invoice.class);
       invoiceRepository.save(invoice);
    }

    @Override
    public void update(UpdateInvoice request,int id) {
        invoiceBusinessRulesService.checkIfByIdExists(id);
        rentalBusinessRulesService.checkIfByIdExists(request.getRentalId());
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        modelMapperService.dtoToEntity().map(request,invoice);
        invoiceRepository.save(invoice);

    }

    @Override
    public void delete( int id) {
        invoiceRepository.deleteById(id);

    }

    @Override
    public List<GetAllInvoice> getAll() {
        List<Invoice> invoices = invoiceRepository.findAll();
        List<GetAllInvoice> response = invoices.stream().map(invoice -> modelMapperService.entityToDto().map(invoice,GetAllInvoice.class)).toList();
        return response;
    }

    @Override
    public GetByIdInvoice getById(int id) {
        invoiceBusinessRulesService.checkIfByIdExists(id);
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        GetByIdInvoice response = modelMapperService.entityToDto().map(invoice,GetByIdInvoice.class);
        return response;
    }


}
