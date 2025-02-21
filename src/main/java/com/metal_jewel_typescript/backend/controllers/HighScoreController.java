package com.metal_jewel_typescript.backend.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.metal_jewel_typescript.backend.models.HighScore;
import com.metal_jewel_typescript.backend.services.HighScoreService;

@CrossOrigin("*")
@RestController
public class HighScoreController {
    private final HighScoreService highScoreService;

    public HighScoreController(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    @GetMapping("/high-scores")
    public List<HighScore> getHighScores() {
        return highScoreService.getHighScores();
    }

    @PostMapping("/high-score")
    public void setHighScore(@RequestParam int point) {
        highScoreService.setHighScore(point);
    }
}