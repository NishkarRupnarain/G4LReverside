package com.g4l.Project_Simulation_Nishkar.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user_payment", indexes = {
        @Index(name = "user_id_payments_idx", columnList = "user_id")
})
public class UserPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser_payment", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "payment_type", length = 45)
    private String paymentType;

    @Column(name = "provider", length = 45)
    private String provider;

    @Column(name = "account_number", length = 45)
    private String accountNumber;

    @Column(name = "expiry")
    private LocalDate expiry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

}