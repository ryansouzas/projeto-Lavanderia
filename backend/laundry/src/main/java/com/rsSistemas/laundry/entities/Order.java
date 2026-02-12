package com.rsSistemas.laundry.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime creationDate;

    private String description;
    private Double price;
    private LocalDateTime completionDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
