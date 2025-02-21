package com.metal_jewel_typescript.backend.models;

import java.time.*;

public class HighScore {
    private final String timeCreated;
    private final int point;

    public HighScore(int point) {
        this.timeCreated = LocalDateTime.now(ZoneId.of("Europe/Paris")).toString();
        this.point = point;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public int getPoint() {
        return point;
    }
}
