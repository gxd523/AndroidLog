package com.github.gxd523.log

import android.util.Log

object GGLogConfig {
    var forceOpen = false
}

private const val TAG = "ggg"
private val gLogToggle get() = GGLogConfig.forceOpen

fun String.ggLog(throwable: Throwable? = null, tag: String = TAG) {
    if (gLogToggle) Log.d(tag, this, throwable)
}