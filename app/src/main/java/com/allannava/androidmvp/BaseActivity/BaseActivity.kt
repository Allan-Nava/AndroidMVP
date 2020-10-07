package com.allannava.androidmvp.BaseActivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Allan Nava on 07/10/2020.
 * Updated by Allan Nava on 07/10/2020.
 */
interface BaseOnActivityResult {
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}

abstract class BaseActivity: AppCompatActivity(), BaseContracts.View {

    override fun getActivityContext(): Context? {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    val mScreenWidth: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getWidth()!!
        }

    val mScreenHeight: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getHeight()!!
        }

    /*override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase!!))
    }*/

}