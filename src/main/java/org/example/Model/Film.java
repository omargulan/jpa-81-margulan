package org.example.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Table(name = "films")
@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private double rating;

    private String genre;
    @Column( name = "release_year")
    private int releaseYear;

    @Enumerated
    private Mpa mpa;

    @ManyToMany
    @JoinTable(
            name = "films_genres",
            joinColumns = @JoinColumn(name = "films_id"),
            inverseJoinColumns = @JoinColumn(name = "genres_id")
    )
    private List<Genre> genres;



}
