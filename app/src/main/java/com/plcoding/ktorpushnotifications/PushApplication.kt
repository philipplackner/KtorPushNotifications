package com.plcoding.ktorpushnotifications

import android.app.Application
import com.onesignal.OneSignal

class PushApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {
        private const val ONESIGNAL_APP_ID = "cb36d618-3937-4e76-a615-22ec5bec1643"
    }
}