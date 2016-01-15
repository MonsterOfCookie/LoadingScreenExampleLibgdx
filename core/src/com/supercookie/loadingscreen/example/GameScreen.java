package com.supercookie.loadingscreen.example;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class GameScreen extends ScreenAdapter {

    private final LoadingScreenGame game = (LoadingScreenGame) Gdx.app.getApplicationListener();
    private final AssetManager assetManager = game.getAssetManager();
    private final Batch batch = game.getBatch();

    private Texture splash;

    @Override
    public void show() {
        super.show();
        splash = assetManager.get("splash.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(splash, 0, 0);
        batch.end();
    }
}
