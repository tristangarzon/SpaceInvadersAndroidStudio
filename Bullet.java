package com.example.mrtri.spaceinvaders;

import android.graphics.RectF;

/**
 * Created by MrTri on 2017-04-20.
 */

public class Bullet {
    private float x;
    private float y;

    private RectF rect;
    public final int UP = 0;
    public final int DOWN = 1;
    int heading = -1;

    //Bullet Speed
    float speed =  500;

    //Bullet Width/height
    private int width = 5;
    private int height;

    private boolean isActive;

    public Bullet(int screenY) {

        height = screenY / 30;
        isActive = false;
        rect = new RectF();
    }


    public RectF getRect(){
        return  rect;
    }

    public boolean getStatus(){
        return isActive;
    }

    public void setInactive(){
        isActive = false;
    }

    public float getImpactPointY(){
        if (heading == DOWN){
            return y + height;
        }else{
            return  y;
        }

    }

    //Shoot
    public boolean shoot(float startX, float startY, int direction) {
        if (!isActive) {
            x = startX;
            y = startY;
            heading = direction;
            isActive = true;
            return true;
        }
        return false;
    }
    public void update(long fps){

        if(heading == UP){
            y = y - speed / fps;
        }else{
            y = y + speed / fps;
        }

        // Update rect
        rect.left = x;
        rect.right = x + width;
        rect.top = y;
        rect.bottom = y + height;

    }

}
