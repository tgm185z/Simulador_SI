package com.traficosi;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Teresa on 06/11/2016.
 */

public class Carril {
    //Semaforo sem;
    int xOrigen;
    int yOrigen;
    int xDestino;
    int yDestino;
    long ultimoCoche = 0;
    //creara coches cada coches_por_min/60
    float coches_por_min = 0;
    Array<Coche> coches;
    //TODO: en el draw que compruebe si el coche ha superado la xDestino y en ese eliminarlo del array

    public Carril(int xO, int yO, int xD, int yD, float densidad){
        xOrigen = xO;
        yOrigen = yO;
        xDestino = xD;
        yDestino = yD;
        coches_por_min = densidad;
        coches = new Array<Coche>();
    }

    public void draw(SpriteBatch batch){
        for(int i = 0; i< coches.size; i++) {
            coches.get(i).draw(batch);
        }
    }

    //get/set ultimocoche

   public void creaCoche(){
        System.out.println("run carril");

                int vx = 0;
                if(xDestino > xOrigen) vx = 1;
                else if (xDestino < xOrigen) vx = -1;

                int vy = 0;
                if(yDestino > yOrigen) vy = 1;
                else if (yDestino < yOrigen) vy = -1;


                coches.add(new Coche("Red", xOrigen, yOrigen, vx, vy));

                ultimoCoche = System.currentTimeMillis();


    }
}
