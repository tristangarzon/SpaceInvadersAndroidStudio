package com.example.mrtri.spaceinvaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

// Mobile Programming - GAME 252-0NA
// By: Tristan Garzon
// Final Project, For: Volodymyr Voytenko
public class SpaceInvadersActivity extends Activity {

    SpaceInvadersView spaceInvadersView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        spaceInvadersView = new SpaceInvadersView(this, size.x, size.y);
        setContentView(spaceInvadersView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        spaceInvadersView.resume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        spaceInvadersView.pause();
    }
}