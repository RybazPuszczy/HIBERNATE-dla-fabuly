package info.pl.rybarczyk.dlafabuly.merchant;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "merchants")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "admin_id")
    private Integer adminId;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    public Merchant(){}
    
    public Merchant(Integer id, String merchantName, Integer adminId, LocalDateTime createdAt){
        this.id = id;
        this.merchantName = merchantName;
        this.adminId = adminId;
        this.createdAt = createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
