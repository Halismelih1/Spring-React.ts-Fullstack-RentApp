package com.example.Server.Services.Concretes;

import com.example.Server.Core.Mapper.ModelMapperService;
import com.example.Server.Dtos.Requests.Invoice.AddInvoice;
import com.example.Server.Dtos.Requests.Invoice.UpdateInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetAllInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetByIdInvoice;
import com.example.Server.Entities.Invoice;
import com.example.Server.Repositories.InvoiceRepository;
import com.example.Server.Services.Abstracts.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service
public class InvoiceManager implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final ModelMapperService modelMapperService;


    @Override
    public void add(@RequestBody AddInvoice request) {
       Invoice invoice = modelMapperService.dtoToEntity().map(request, Invoice.class);
       invoiceRepository.save(invoice);
    }

    @Override
    public void update(@RequestBody UpdateInvoice request,@PathVariable int id) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        modelMapperService.dtoToEntity().map(request,invoice);
        invoiceRepository.save(invoice);

    }

    @Override
    public void delete(@PathVariable int id) {
        invoiceRepository.deleteById(id);

    }

    @Override
    public List<GetAllInvoice> getAll() {
        List<Invoice> invoices = invoiceRepository.findAll();
        List<GetAllInvoice> response = invoices.stream().map(invoice -> modelMapperService.entityToDto().map(invoice,GetAllInvoice.class)).toList();
        return response;
    }

    @Override
    public GetByIdInvoice getById(@PathVariable int id) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        GetByIdInvoice response = modelMapperService.entityToDto().map(invoice,GetByIdInvoice.class);
        return response;
    }
}
