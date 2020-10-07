package com.allannava.androidmvp.BaseActivity

import android.app.Activity
import android.content.Context
import android.os.Bundle

/**
 * Created by Allan Nava on 07/10/2020.
 * Updated by Allan Nava on 07/10/2020.
 */
object BaseContracts{

    interface View {
        fun getActivityContext(): Context?
        fun showDialog(title: String)
    }

    interface Presenter {
        fun onCreate(bundle: Bundle? = null) {}
        fun onResume() {}
        fun onPause() {}
        fun onDestroy()
    }

    interface Interactor {
        fun unregister()
    }

    interface InteractorOutput //does nothing for now

    interface Router {
        var activity: Activity?
        fun unregister()
    }

}