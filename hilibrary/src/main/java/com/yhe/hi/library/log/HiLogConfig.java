package com.yhe.hi.library.log;

public abstract class HiLogConfig {

    public String getGlobalTag() {
        return "HiLog";
    }

    public boolean enable() {
        return true;
    }
}
