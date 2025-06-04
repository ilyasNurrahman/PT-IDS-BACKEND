package com.example.backend_pt_ids.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {

    @Id
    private Integer id;
    private String productID;
    private String productName;
    private String amount;
    private String customerName;
    private Integer status;
    private LocalDateTime transactionDate;
    private String createBy;
    private LocalDateTime createOn;

}
