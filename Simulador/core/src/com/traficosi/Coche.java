package com.traficosi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Teresa on 06/11/2016.
 */

public class Coche {
    SpriteBatch batch;
    Texture Car;
    Sprite sprite;
    int x = 0;
    int y = 0;

    //los incrementos de posicion para que se mueva el coche
    int velocidadx, velocidady = 0;

    public Coche(String color, int x_, int y_, int velocidad_X, int velocidad_Y){

        Car = new Texture("RedCar.png");
        velocidadx = velocidad_X;
        velocidady = velocidad_Y;
        x = x_;
        y = y_;
        //setSize(60, 30);
        System.out.println("constructor coche");
    }


    public void draw(SpriteBatch batch){

        x += velocidadx;
        y+= velocidady;

        batch.draw(Car, x, y, 60, 30);
    }



}
