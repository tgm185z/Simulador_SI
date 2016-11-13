package com.traficosi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class MainTrafico extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fondo;
	Array<Carril> carriles;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		fondo = new Texture("cruceFondo.png");
		carriles = new Array<Carril>();
		Carril a = new Carril(0, 200, 640, 200, 30);
		carriles.add(a);
		a.creaCoche();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		batch.begin();


		batch.draw(fondo, 0, 0, 640, 480);
		for(int i = 0; i<carriles.size; i++){
			carriles.get(i).draw(batch);
		}


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		fondo.dispose();
	}
}
