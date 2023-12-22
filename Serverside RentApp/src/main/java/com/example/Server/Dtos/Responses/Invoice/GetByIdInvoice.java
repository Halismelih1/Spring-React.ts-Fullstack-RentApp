package com.example.Server.Dtos.Responses.Invoice;

import lombok.Data;

import java.time.LocalDate;
@Data
public class GetByIdInvoice {
    private int id;
    private LocalDate createDate;
}
