package com.chaos.main.level.tile;

import com.chaos.main.graphics.Screen;
import com.chaos.main.graphics.Sprite;

public class Tile {

    public int x, y;
    public Sprite sprite;

    public static Tile grass = new TileBackground(Sprite.basic);

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {
    }

    public boolean solid() {
        return false;
    }

}
