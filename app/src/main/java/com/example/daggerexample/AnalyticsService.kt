package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class MixpanelAnalytics @Inject constructor() : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "trackEvent: Mixpanel - $eventName - $eventType")
    }

}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "trackEvent: Mixpanel - $eventName - $eventType")
    }
}