package org.climbing.app.service;

import org.climbing.app.DTO.ClimbsDTO;
import org.climbing.app.domain.Climbs;
import org.climbing.app.repository.ClimbingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClimbingService {

    @Autowired
    private ClimbingRepository climbingRepository;

    public Optional<Climbs> getClimbs(long id) {
        return climbingRepository.findById(id);
    }

    public void addClimb(ClimbsDTO climb) {
        if(climb != null) {
            try {
                Climbs newClimb = new Climbs();
                newClimb.setId(climb.getId());
                setClimb(climb, newClimb);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Climbs updateClimb(Long id, ClimbsDTO climbsDTO) {
        if(climbsDTO != null) {
            try {
                Climbs existingClimb = climbingRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Climb not found with id " + id));

                // Update fields from DTO
                setClimb(climbsDTO, existingClimb);
                return existingClimb;
            }
            catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    private void setClimb(ClimbsDTO climbsDTO, Climbs existingClimb) {
        try {
            existingClimb.setName(climbsDTO.getName());
            existingClimb.setGrade(climbsDTO.getGrade());
            existingClimb.setLocation(climbsDTO.getLocation());
            existingClimb.setNotes(climbsDTO.getNotes());
            existingClimb.setStars(climbsDTO.getStars());
            existingClimb.setType(climbsDTO.getType());
            existingClimb.setDateAttempted(climbsDTO.getDateAttempted());
            existingClimb.setAttempts(climbsDTO.getAttempts());
            existingClimb.setTags(climbsDTO.getTags());
            existingClimb.setGym(climbsDTO.getGym());

            climbingRepository.save(existingClimb);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
