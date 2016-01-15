package com.supercookie.loadingscreen.example;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class LoadingScreen extends ScreenAdapter {

    private static final float PROGRESS_BAR_WIDTH = LoadingScreenGame.WORLD_WIDTH / 2f;
    private static final float PROGRESS_BAR_HEIGHT = 50f;

    private final LoadingScreenGame game = (LoadingScreenGame) Gdx.app.getApplicationListener();
    private final AssetManager assetManager = game.getAssetManager();
    private final ShapeRenderer shapeRenderer = game.getShapeRenderer();

    @Override
    public void show() {
        super.show();
        assetManager.load("splash.png", Texture.class);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        renderProgressBar();

        if (assetManager.update()) {
            // Comment this out if you just want to see the progress bar. As this can be quite quick on desktop.
            game.setScreen(new GameScreen());
        }
    }

    private void renderProgressBar() {
        float progress = assetManager.getProgress();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.rect(
                (LoadingScreenGame.WORLD_WIDTH - PROGRESS_BAR_WIDTH) / 2f,
                (LoadingScreenGame.WORLD_HEIGHT - PROGRESS_BAR_HEIGHT) / 2f,
                PROGRESS_BAR_WIDTH * progress,
                PROGRESS_BAR_HEIGHT
        );
        shapeRenderer.end();
    }

}