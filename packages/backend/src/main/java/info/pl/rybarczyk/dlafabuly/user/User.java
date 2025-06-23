package info.pl.rybarczyk.dlafabuly.user;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public User(){}

    public User(Integer id, String fullName, LocalDateTime createdAt){
        this.id = id;
        this.fullName = fullName;
        this.createdAt = createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
