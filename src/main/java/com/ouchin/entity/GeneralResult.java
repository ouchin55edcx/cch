package com.ouchin.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
@Table(name = "general_results")


public class GeneralResult {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cyclist_id", nullable = false)
    @NotNull(message = "Cyclist is required")
    private Cyclist cyclist;

    @ManyToOne
    @JoinColumn(name = "competition_id", nullable = false)
    @NotNull(message = "Competition is required")
    private Competition competition;

    @Column(name = "duration_generale", nullable = false)
    @NotNull(message = "General duration is required")
    private Duration durationGenerale;

    @Column(name = "generale_rank", nullable = false)
    @NotNull(message = "General rank is required")
    @Min(value = 1, message = "Rank must be greater than 0")
    private Integer generaleRank;

}
