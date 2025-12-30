package org.climbing.app.controller;

import org.climbing.app.DTO.ClimbsDTO;
import org.climbing.app.domain.Climbs;
import org.climbing.app.mapper.ClimbsMapper;
import org.climbing.app.service.ClimbingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/climbs")
public class ClimbingController {

    @Autowired
    private ClimbingService climbingService;

    @GetMapping("/getClimb")
    public Optional<Climbs> getClimb(long id) {
        return climbingService.getClimbs(id);
    }

    @GetMapping("getAllClimbs")
    public List<Climbs> getAllClimbs() {
        return climbingService.getAllClimbs();
    }

    @PostMapping("/addClimb")
    @ResponseBody
    public void addClimb(@RequestBody ClimbsDTO climbDTO) {
        climbingService.addClimb(climbDTO);
    }

    @PutMapping("/updateClimb/{id}")
    public ClimbsDTO updateClimb(@PathVariable Long id, @RequestBody ClimbsDTO climbDTO) {
        Climbs updatedClimb = climbingService.updateClimb(id, climbDTO);

        // Convert back to DTO for the response
        return ClimbsMapper.toDTO(updatedClimb);
    }
}
