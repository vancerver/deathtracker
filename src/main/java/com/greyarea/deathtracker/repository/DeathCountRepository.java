package com.greyarea.deathtracker.repository;

import com.greyarea.deathtracker.model.DeathCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathCountRepository extends JpaRepository<DeathCount, Long> {

}
