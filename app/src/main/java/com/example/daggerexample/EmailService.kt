package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "send: Email sent")
    }

}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "send: Message sent - Retry count $retryCount")
    }

}