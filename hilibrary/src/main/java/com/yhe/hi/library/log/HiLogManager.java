package com.yhe.hi.library.log;

import androidx.annotation.NonNull;

public class HiLogManager {

    private HiLogConfig config;
    private static HiLogManager instance;

    private HiLogManager(HiLogConfig config) {
        this.config = config;
    }

    public static HiLogManager getInstance() {
        return instance;
    }

    public static void init(@NonNull HiLogConfig config) {
        instance = new HiLogManager(config);
    }

    public HiLogConfig getConfig() {
        return config;
    }
}
