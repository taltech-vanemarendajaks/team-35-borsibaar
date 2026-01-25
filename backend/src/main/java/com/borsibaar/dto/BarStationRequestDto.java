package com.borsibaar.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.UUID;

public record BarStationRequestDto(
        @NotBlank(message = "Station name is required")
        String name,
        String description,
        Boolean isActive,
        List<UUID> userIds
) {
}

