package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;

/**
 * Created by wilsonmitchell on 10/7/14.
 */
public class GopherInputProcessor extends InputAdapter {
    public MiniGame game;

    public GopherInputProcessor(final MiniGame game) {
        this.game = game;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return game.onTouchDown(screenX, screenY, pointer, button);
    }
}
