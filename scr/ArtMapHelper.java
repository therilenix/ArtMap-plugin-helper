package com.example.artmap;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class ArtMapHelper implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyHandler.register();
        OverlayRenderer.init();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            KeyHandler.tick(client);
        });
    }
}
