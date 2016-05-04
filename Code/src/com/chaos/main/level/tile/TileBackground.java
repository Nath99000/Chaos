package com.chaos.main.level.tile;

import com.chaos.main.graphics.Screen;
import com.chaos.main.graphics.Sprite;

public class TileBackground extends Tile {

    public TileBackground(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x, y, this);
    }

}