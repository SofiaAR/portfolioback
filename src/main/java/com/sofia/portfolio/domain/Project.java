package com.sofia.portfolio.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "projects")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500)
    private String description;

    @Column(length = 200)
    private String repoUrl;

    @Column(length = 200)
    private String liveUrl;

    @Column(nullable = false)
    private Instant createdAt;

    @Column(nullable = false, length = 120)
private String title;

    @PrePersist
    void onCreate() {
        if (createdAt == null) createdAt = Instant.now();
    }

    
}
