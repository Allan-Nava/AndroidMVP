package com.allannava.androidmvp.BaseActivity

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by Allan Nava on 07/10/2020.
 * Updated by Allan Nava on 07/10/2020.
 */
class AndroidMVPApplication : Application() {
    private val TAG = "AndroidMVPApplication"
    //
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        Log.i(TAG, "attachBaseContext()")
        //MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        var appContext: Context? = null
            private set

        fun activityResumed() {
            isActivityVisible = true
        }

        fun activityPaused() {
            isActivityVisible = false
        }

        var isActivityVisible: Boolean = false
            private set
    }

}