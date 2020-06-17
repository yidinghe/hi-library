package com.yhe.hi.library.app.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yhe.hi.library.app.R
import com.yhe.hi.library.log.HiLog
import kotlinx.android.synthetic.main.activity_hi_log_demo.*

class HiLogDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)

        btn_log.setOnClickListener { printLog() }
    }

    private fun printLog() {
        HiLog.a("9900")
    }
}