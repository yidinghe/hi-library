package com.yhe.hi.library.log;

import androidx.annotation.NonNull;

import com.yhe.hi.library.log.HiLogConfig;

public interface HiLogPrinter {
    void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString);
}
