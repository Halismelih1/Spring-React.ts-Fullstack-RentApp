package com.example.Server.Dtos.Responses.Invoice;

import com.example.Server.Dtos.Responses.Rental.GetByIdRental;
import lombok.Data;

import java.time.LocalDate;
@Data
public class GetByIdInvoice {
    private int id;
    private LocalDate createDate;
    private GetByIdRental rental;

}
