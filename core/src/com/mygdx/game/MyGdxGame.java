package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private MiniGame currentMiniGame;
	
	@Override
	public void create () {
		currentMiniGame = new WhackAMole();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		currentMiniGame.tick();
        currentMiniGame.render();
	}

    @Override
    public void resize(int width, int height) {
        super.resize(480, 320);
    }
}
