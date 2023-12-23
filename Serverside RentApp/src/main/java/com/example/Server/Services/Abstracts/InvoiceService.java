package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Invoice.AddInvoice;
import com.example.Server.Dtos.Requests.Invoice.UpdateInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetAllInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetByIdInvoice;

import java.util.List;

public interface InvoiceService {
    public void add(AddInvoice request);
    public void update(UpdateInvoice request,int id);
    public void delete(int id);
    public List<GetAllInvoice> getAll();
    public GetByIdInvoice getById(int id);
}
