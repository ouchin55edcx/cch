package com.ouchin.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

@Data

@Entity
@Table(name = "competitions")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Date is required ")
    @Column(nullable = false)
    private LocalDate date;

    @NotBlank(message = "Location is required")
    @Column(nullable = false)
    private String location;

    @NotBlank(message = "Duration is required ")
    @Column(nullable = false)
    private Duration duration;

    @ManyToMany(mappedBy = "competitions")
    private Set<Cyclist> cyclists;

    @OneToMany(mappedBy = "competition")
    private Set<Stage> stages;




}
