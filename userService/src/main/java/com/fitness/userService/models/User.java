package com.fitness.userService.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity   // springboot ko pata chal gaya ye class database table banegi
@Table(name= "users")   // db table ka name "users" hoga
@Data            // Lombok library ka annotation hai for @getter,@setter,@ToString (email ke liye get wagera nahi karna padta hai) etc..
public class User {
    @Id             // ye primary key hai
    @GeneratedValue(strategy = GenerationType.UUID)   //UUID used in prod for better security
    private String id;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
