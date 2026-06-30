package com.architectureai.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO representing a project returned to the client.
 *
 * <p>Never exposes the entity class directly, in accordance with clean architecture rules.</p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectResponse {

    private String id;

    private String projectName;

    private String description;

    private Instant createdAt;

    private Instant updatedAt;
}
