package com.ouchin.dto.response;

import java.time.LocalDate;

public record CyclistResponseDto(
        Long id,
        String lastName,
        String firstName,
        String nationality,
        LocalDate birthday,
        String team
) {}