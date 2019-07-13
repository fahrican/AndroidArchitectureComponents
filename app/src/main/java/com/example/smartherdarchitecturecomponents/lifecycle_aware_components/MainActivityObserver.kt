package com.example.smartherdarchitecturecomponents.lifecycle_aware_components

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver {

    private val TAG = "MainActivityObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun personalOnCreateEvent() {

        Log.v(TAG, "Observer onCreate()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun personalOnStartEvent() {

        Log.v(TAG, "Observer onStart()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun personalOnResumeEvent() {

        Log.v(TAG, "Observer onResume()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun personalOnPauseEvent() {

        Log.v(TAG, "Observer onPause()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun personalOnDestroyEvent() {

        Log.v(TAG, "Observer onDestroy()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun personalOnStopEvent() {

        Log.v(TAG, "Observer onStop()")
    }
}