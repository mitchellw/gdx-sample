package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wilsonmitchell on 10/7/14.
 */
public class WhackAMole implements MiniGame {
    private static final long SPAWN_TIME = 5000;
    private static final int POINTS_TO_WIN = 10;

    private long lastSpawned;
    private int score;
    private List<Gopher> gopherList;

    public WhackAMole() {
        gopherList = new ArrayList<Gopher>();
    }

    @Override
    public boolean isGameWon() {
        return score >= POINTS_TO_WIN;
    }

    @Override
    public void tick() {
        if (lastSpawned < SPAWN_TIME) {
            // TODO: Spawn a gopher
            lastSpawned = System.currentTimeMillis();
        }
    }
}
