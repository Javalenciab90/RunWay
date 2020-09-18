package com.java90.runway.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.java90.runway.other.Constants.ACTION_PAUSE_SERVICE
import com.java90.runway.other.Constants.ACTION_START_OR_RESUME_SERVICE
import com.java90.runway.other.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

/*
    Connection between Service and Activity
*/

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        intent?.let {
            when(it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Start or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Pause service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stop service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}