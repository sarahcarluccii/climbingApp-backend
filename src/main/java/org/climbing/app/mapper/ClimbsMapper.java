package org.climbing.app.mapper;

import org.climbing.app.domain.Climbs;
import org.climbing.app.DTO.ClimbsDTO;

public class ClimbsMapper {

    // Convert entity to DTO
    public static ClimbsDTO toDTO(Climbs climb) {
        if (climb == null) return null;

        ClimbsDTO dto = new ClimbsDTO();
        dto.setId(climb.getId());
        dto.setName(climb.getName());
        dto.setGrade(climb.getGrade());
        dto.setLocation(climb.getLocation());
        dto.setNotes(climb.getNotes());
        dto.setStars(climb.getStars());
        dto.setType(climb.getType());
        dto.setDateAttempted(climb.getDateAttempted());
        dto.setAttempts(climb.getAttempts());
        dto.setTags(climb.getTags());
        dto.setGym(climb.getGym());
        return dto;
    }

    // Convert DTO to entity
    public static Climbs toEntity(ClimbsDTO dto) {
        if (dto == null) return null;

        Climbs climb = new Climbs();
        climb.setId(dto.getId());
        climb.setName(dto.getName());
        climb.setGrade(dto.getGrade());
        climb.setLocation(dto.getLocation());
        climb.setNotes(dto.getNotes());
        climb.setStars(dto.getStars());
        climb.setType(dto.getType());
        climb.setDateAttempted(dto.getDateAttempted());
        climb.setAttempts(dto.getAttempts());
        climb.setTags(dto.getTags());
        climb.setGym(dto.getGym());
        return climb;
    }
}
