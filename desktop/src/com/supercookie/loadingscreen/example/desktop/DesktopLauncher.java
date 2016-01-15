package com.supercookie.loadingscreen.example.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.supercookie.loadingscreen.example.LoadingScreenGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "LoadingScreenExample Desktop";
		cfg.width = 1280;
		cfg.height = 780;

		new LwjglApplication(new LoadingScreenGame(), cfg);
	}
}
