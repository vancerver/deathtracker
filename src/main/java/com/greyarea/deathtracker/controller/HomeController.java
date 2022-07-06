package com.greyarea.deathtracker.controller;

import com.greyarea.deathtracker.model.DeathCount;
import com.greyarea.deathtracker.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@Controller
public class HomeController {
    final CountService countService;

    public HomeController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping("/{userId}")
    @ResponseBody
    public String getHomepage(@PathVariable Long userId, Model map) {

        DeathCount deathCount = countService.getCount(userId);

        return
                """
                        <html>
                        <head>
                            <title>DeathCountTracker</title>
                        </head>
                        <body>
                        User \s deaths
                        </body>
                        </html>
                        """.formatted(deathCount.getCount());
    }
}
