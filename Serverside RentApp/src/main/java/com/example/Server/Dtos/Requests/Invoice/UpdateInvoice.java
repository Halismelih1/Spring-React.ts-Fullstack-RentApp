package com.example.Server.Dtos.Requests.Invoice;

import lombok.Data;
import java.time.LocalDate;

@Data
public class UpdateInvoice {
    private int id;
    private LocalDate createDate;
    private int rentalId;


}
