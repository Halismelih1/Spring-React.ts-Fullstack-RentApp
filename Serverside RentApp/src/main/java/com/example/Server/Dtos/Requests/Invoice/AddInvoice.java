package com.example.Server.Dtos.Requests.Invoice;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AddInvoice {
    private LocalDate createDate;
}
