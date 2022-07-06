package com.greyarea.deathtracker.controller;

import com.greyarea.deathtracker.model.DeathCount;
import com.greyarea.deathtracker.service.CountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/count")
public class CountController {
    final CountService countService;

    public CountController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping( "/{id}")
    public DeathCount getCount(@PathVariable Long id) {
        return countService.getCount(id);
    }

    @PutMapping("/{id}")
    public DeathCount putCount(@RequestBody DeathCount deathCount) {
        return countService.putCount(deathCount);
    }

}
