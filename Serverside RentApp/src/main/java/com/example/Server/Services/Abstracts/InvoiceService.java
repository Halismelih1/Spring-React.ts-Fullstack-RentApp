package com.example.Server.Services.Abstracts;

import com.example.Server.Dtos.Requests.Invoice.AddInvoice;
import com.example.Server.Dtos.Requests.Invoice.UpdateInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetAllInvoice;
import com.example.Server.Dtos.Responses.Invoice.GetByIdInvoice;

import java.util.List;

public interface InvoiceService {
     void add(AddInvoice request);
     void update(UpdateInvoice request,int id);
     void delete(int id);
     List<GetAllInvoice> getAll();
     GetByIdInvoice getById(int id);

}
