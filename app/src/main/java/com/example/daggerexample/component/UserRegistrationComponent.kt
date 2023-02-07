package com.example.daggerexample.component

import com.example.daggerexample.module.AnalyticsServiceModule
import com.example.daggerexample.module.NotificationServiceModule
import com.example.daggerexample.module.UserRepositoryModule
import com.example.daggerexample.ui.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [UserRepositoryModule::class, NotificationServiceModule::class, AnalyticsServiceModule::class]
)
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance retryCount: Int
        ): UserRegistrationComponent
    }
}