package com.allannava.androidmvp.BaseActivity

import android.content.Context
import android.content.ContextWrapper
import android.support.v4.app.Fragment

/**
 * Created by Allan Nava on 07/10/2020.
 * Updated by Allan Nava on 07/10/2020.
 */
abstract class BaseFragment : Fragment(), BaseContracts.View {

    fun getBaseActivity():  BaseActivity? {
        var context = context
        while (context is ContextWrapper) {
            if (context is  BaseActivity) {
                return context
            }
            context = context.baseContext
        }
        return null
    }

    val mScreenWidth: Int
        get() {
            return getBaseActivity()?.windowManager?.getDefaultDisplay()?.getWidth()!!
        }

    val mScreenHeight: Int
        get() {
            return getBaseActivity()?.windowManager?.getDefaultDisplay()?.getHeight()!!
        }
    override fun getActivityContext(): Context? {
        return getBaseActivity()
    }


    var statusBarHeight: Int = 0
        get(){
            var result = 0
            val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = resources.getDimensionPixelSize(resourceId)
            }
            return result
        }

}