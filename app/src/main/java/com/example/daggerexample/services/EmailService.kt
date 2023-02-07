package com.example.daggerexample.services

import android.util.Log
import com.example.daggerexample.util.TAG
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

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