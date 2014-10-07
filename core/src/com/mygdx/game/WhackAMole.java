package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wilsonmitchell on 10/7/14.
 */
public class WhackAMole implements MiniGame {
    private static final long SPAWN_TIME = 5000;
    private static final int POINTS_TO_WIN = 10;

    private long lastSpawned;
    private int score;
    private List<Gopher> gopherList;
    private SpriteBatch batch;

    public WhackAMole() {
        gopherList = new ArrayList<Gopher>();
        batch = new SpriteBatch();
    }

    @Override
    public boolean isGameWon() {
        return score >= POINTS_TO_WIN;
    }

    @Override
    public void tick() {
        float timeSinceLastSpawn = System.currentTimeMillis() - lastSpawned;
        if (timeSinceLastSpawn > SPAWN_TIME) {
            Random random = new Random();
            float x = random.nextFloat() * 480;
            float y = random.nextFloat() * 320;
            Gopher newGopher = new Gopher(x, y);
            gopherList.add(newGopher);
            lastSpawned = System.currentTimeMillis();
        }
    }

    public void render() {
        batch.begin();
        for (Gopher gopher : gopherList) {
            batch.draw(gopher.getImage(), gopher.getX(), gopher.getY(), gopher.getWidth(), gopher.getHeight());
        }
        batch.end();
    }
}
