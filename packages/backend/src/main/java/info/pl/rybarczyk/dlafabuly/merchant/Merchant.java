package info.pl.rybarczyk.dlafabuly.merchant;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

}
