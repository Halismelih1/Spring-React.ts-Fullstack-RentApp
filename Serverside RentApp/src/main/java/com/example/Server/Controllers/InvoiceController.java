package com.example.Server.Controllers;

import com.example.Server.Dtos.Requests.Invoice.AddInvoice;
import com.example.Server.Dtos.Requests.Invoice.UpdateInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetAllInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetByIdInvoice;
import com.example.Server.Services.Abstracts.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public void add(@RequestBody AddInvoice request){
        invoiceService.add(request);
    }

    @PutMapping("{id}")
    public void update(@RequestBody UpdateInvoice request,@PathVariable int id){
        invoiceService.update(request,id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        invoiceService.delete(id);
    }

    @GetMapping
    public List<GetAllInvoice> getAll(){
        return invoiceService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdInvoice getById(int id){
        return invoiceService.getById(id);
    }
}
