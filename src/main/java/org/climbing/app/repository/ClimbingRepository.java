package org.climbing.app.repository;

import org.climbing.app.domain.Climbs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClimbingRepository extends JpaRepository<Climbs, Long> {

    Optional<Climbs> findById(long id);

    List<Climbs> findByGrade(String grade);

    List<Climbs> findAll();
}
