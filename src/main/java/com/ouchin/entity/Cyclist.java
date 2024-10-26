package com.ouchin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The first name  is required")
    @Column(name = "last_name", nullable = false)
    private String LastName;

    @NotBlank(message = "The last name is required")
    @Column(name = "first_name", nullable = false)
    private String FirstName;

    @NotBlank(message = "Nationaly is required")
    @Column(nullable = false)
    private String nationality;

    @NotBlank(message = "The birthay is required")
    @Past(message = "The birthay must be in the past")
    @Column(nullable = false)
    private LocalDate Birthday;

    @NotBlank(message = "The team is required")
    @Column(nullable = false)
    private String team;


    @ManyToMany(mappedBy = "cyclists")
    private Set<Stage> stages;


    @OneToMany(mappedBy = "cyclist")
    private Set<GeneralResult> generalResults;

    public Cyclist(Object o, String mustapha, String ouchin, String morroco, LocalDate of, String teamA) {
    }
}
