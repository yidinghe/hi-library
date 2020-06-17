package com.yhe.hi.library.app

import android.app.Application
import com.google.gson.Gson
import com.yhe.hi.library.log.HiConsolePrinter
import com.yhe.hi.library.log.HiLogConfig
import com.yhe.hi.library.log.HiLogManager

class MApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        HiLogManager.init(object : HiLogConfig() {
            override fun injectJsonParser(): JsonParser {
                return JsonParser { src -> Gson().toJson(src) }
            }

            override fun getGlobalTag(): String {
                return "MApplication"
            }

            override fun enable(): Boolean {
                return true
            }
        }, HiConsolePrinter())
    }
}