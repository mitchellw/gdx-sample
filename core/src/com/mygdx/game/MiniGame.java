package com.mygdx.game;

/**
 * Created by wilsonmitchell on 10/7/14.
 */
public interface MiniGame {

    public boolean isGameWon();
    public void tick();
    public void render();
    public void resize(float width, float height);
    public boolean onTouchDown(int screenX, int screenY, int pointer, int button);

}
