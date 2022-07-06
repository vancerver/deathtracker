package com.greyarea.deathtracker.service;

import com.greyarea.deathtracker.model.DeathCount;
import com.greyarea.deathtracker.repository.DeathCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    final DeathCountRepository deathCountRepository;

    public CountService(DeathCountRepository deathCountRepository) {
        this.deathCountRepository = deathCountRepository;
    }

    public DeathCount getCount(Long id) {
        return deathCountRepository.getById(id);
    }

    public DeathCount putCount(DeathCount deathCount) {
        return deathCountRepository.save(deathCount);
    }

}
