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
    private final float width;
    private final float height;
    private final Texture image;

    public Gopher(final float x, final float y, final float width, final float height, final Texture image) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
    }

}
