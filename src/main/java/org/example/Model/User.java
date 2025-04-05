package org.example.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String login;
    private String password;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Enumerated
    private Role role;
}
