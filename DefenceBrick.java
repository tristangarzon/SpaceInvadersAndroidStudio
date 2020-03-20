package com.example.mrtri.spaceinvaders;

import android.graphics.RectF;

/**
 * Created by MrTri on 2017-04-20.
 */

public class DefenceBrick {

    private RectF rect;

    private boolean isVisible;

    public DefenceBrick(int row, int column, int shelterNumber, int screenX, int screenY){

        int width = screenX / 90;
        int height = screenY / 40;
        isVisible = true;

        // Padding
        int brickPadding = 0;

        // Shelters
        int shelterPadding = screenX / 6;
        int startHeight = screenY - (screenY /8 * 2);

        rect = new RectF(column * width + brickPadding +
                (shelterPadding * shelterNumber) +
                shelterPadding + shelterPadding * shelterNumber,
                row * height + brickPadding + startHeight,
                column * width + width - brickPadding +
                        (shelterPadding * shelterNumber) +
                        shelterPadding + shelterPadding * shelterNumber,
                row * height + height - brickPadding + startHeight);
    }
    public RectF getRect(){
        return this.rect;
    }

    public void setInvisible(){
        isVisible = false;
    }

    public boolean getVisibility(){
        return isVisible;
    }


}
