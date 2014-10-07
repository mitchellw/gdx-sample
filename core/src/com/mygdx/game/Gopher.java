package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by wilsonmitchell on 10/7/14.
 */
public class Gopher {
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Texture getImage() {
        return image;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    private float x;
    private float y;
    private final float width = 480 / 10;
    private final float height = 320 / 10;
    private final Texture image = new Texture("gopher.jpg");

    public Gopher(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

}
