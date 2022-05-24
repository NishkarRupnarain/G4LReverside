package com.g4l.Project_Simulation_Nishkar.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "product", indexes = {
        @Index(name = "catergory_id_idx", columnList = "catergory_id"),
        @Index(name = "inventory_id_idx", columnList = "inventory_id"),
        @Index(name = "discount_id_idx", columnList = "discount_id"),
        @Index(name = "SKU_UNIQUE", columnList = "SKU", unique = true)
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduct", nullable = false)
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "`desc`", length = 45)
    private String desc;

    @Column(name = "SKU", nullable = false, length = 45)
    private String sku;

    @Column(name = "catergory", length = 45)
    private String catergory;

    @Column(name = "price")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "discount_id", nullable = false)
    private Discount discount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "catergory_id", nullable = false)
    private ProductCatergory catergory1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inventory_id", nullable = false)
    private ProductInventory inventory;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public ProductCatergory getCatergory1() {
        return catergory1;
    }

    public void setCatergory1(ProductCatergory catergory1) {
        this.catergory1 = catergory1;
    }

    public ProductInventory getInventory() {
        return inventory;
    }

    public void setInventory(ProductInventory inventory) {
        this.inventory = inventory;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}