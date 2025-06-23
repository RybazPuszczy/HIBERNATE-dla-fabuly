package info.pl.rybarczyk.dlafabuly.experience;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "experieces")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "merchant_id")
    private Integer merchantId;

    private Double price;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Experience(){}

    public Experience(Integer id, String name, Integer merchantId, Double price, String status, LocalDateTime createdAt){
        this.id = id;
        this.name = name;
        this.merchantId = merchantId;
        this.price = price;
        this.status = status;
        this.createdAt = createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
