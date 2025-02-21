package com.metal_jewel_typescript.backend.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.metal_jewel_typescript.backend.models.HighScore;
import org.springframework.data.mongodb.core.MongoOperations;

@Service
public class HighScoreService {
    private final MongoOperations mongoOperations;

    public HighScoreService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<HighScore> getHighScores() {
        List<HighScore> highScores = mongoOperations.findAll(HighScore.class);
        highScores.sort((o1, o2) -> ((Integer) o2.getPoint()).compareTo(o1.getPoint()));
        return highScores.subList(0, 4);
    }

    public void setHighScore(int point) {
        mongoOperations.insert(new HighScore(point));
    }
}
