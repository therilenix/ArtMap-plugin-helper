package com.example.artmap;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

import java.io.File;

public class KeyHandler {

    public static KeyBinding loadKey;

    public static void register() {
        loadKey = new KeyBinding("Load Image", GLFW.GLFW_KEY_P, "ArtMap Helper");
    }

    public static void tick(MinecraftClient client) {
        while (loadKey.wasPressed()) {
            File file = new File("image.png");
            OverlayRenderer.pixels = ImageLoader.load(file);
        }
    }
}
