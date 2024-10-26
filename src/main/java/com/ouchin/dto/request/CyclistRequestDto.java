package com.ouchin.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;


import java.time.LocalDate;


public record CyclistRequestDto(
        @NotBlank(message = "Last name is required")
        String lastName,

        @NotBlank(message = "First name is required")
        String firstName,

        @NotBlank(message = "Nationality is required")
        String nationality,

        @Past(message = "Birthday must be in the past")
        LocalDate birthday,

        @NotBlank(message = "Team is required")
        String team
) {
}