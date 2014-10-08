package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Iterator;
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
    private float screenWidth;
    private float screenHeight;

    public WhackAMole() {
        gopherList = new ArrayList<Gopher>();
        batch = new SpriteBatch();
    }

    @Override
    public void resize(float width, float height) {
        this.screenWidth = width;
        this.screenHeight = height;
    }

    @Override
    public boolean onTouchDown(int screenX, int screenY, int pointer, int button) {
        float x = screenX / screenWidth * 480;
        float y = screenHeight - screenY / screenHeight * 320;
        System.out.println("screenX: " + screenX + ", screenY: " + screenY + ", x: " + x + ", y: " + y);
        Iterator<Gopher> iterator = gopherList.iterator();
        while (iterator.hasNext()) {
            Gopher gopher = iterator.next();
            float gopherRight = gopher.getX() + gopher.getWidth();
            float gopherLeft = gopher.getX();
            float gopherTop = gopher.getY();
            float gopherBottom = gopher.getY() + gopher.getHeight();
            if (x > gopherLeft && x < gopherRight && y > gopherTop && y < gopherBottom) {
                iterator.remove();
                score++;
            }
        }
        return false;
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
