package org.example.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String address;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Enumerated
    private OrderStatus status;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList;

}
