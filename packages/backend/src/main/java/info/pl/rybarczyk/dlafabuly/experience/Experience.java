package info.pl.rybarczyk.dlafabuly.experience;

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

}
