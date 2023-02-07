package com.example.daggerexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.R
import com.example.daggerexample.component.DaggerUserRegistrationComponent
import com.example.daggerexample.services.EmailService
import com.example.daggerexample.services.UserRegistrationService
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)
        component.inject(this)

        userRegistrationService.registerUser("my_test@example.com", "11111")
    }
}