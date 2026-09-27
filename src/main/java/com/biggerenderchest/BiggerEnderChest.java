package com.biggerenderchest;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BiggerEnderChest implements ModInitializer {
    public static final String MOD_ID = "biggerenderchest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Bigger Ender Chest initialized (54 slots / 6 rows).");
    }
}
