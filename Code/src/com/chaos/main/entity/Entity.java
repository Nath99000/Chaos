package com.chaos.main.entity;

import com.chaos.main.graphics.Screen;
import com.chaos.main.level.Level;

import java.util.Random;

public abstract class Entity {

    public int x, y;
    private boolean removed = false;
    protected Level level;
    protected final Random random = new Random();

    public void update(){
    }

    public void render(Screen screen){
    }

    public void remove(){
        //Remove from level
        removed=true;
    }

    public boolean isRemoved(){
        return removed;
    }

}