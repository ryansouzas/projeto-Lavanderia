package com.rsSistemas.laundry.entities;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private LocalDateTime dateCadastro;
    
    @OneToMany(mappedBy = "client")
    private Set<Order> orders = new HashSet<>();

    public Client() {
    }

    public Client(Long id, String name, String phone, String email, LocalDateTime dateCadastro) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dateCadastro = dateCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateCadastro() {
        return dateCadastro;
    }

    public void setDateCadastro(LocalDateTime dateCadastro) {
        this.dateCadastro = dateCadastro;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
