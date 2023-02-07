package com.example.daggerexample.component

import com.example.daggerexample.module.NotificationServiceModule
import com.example.daggerexample.module.UserRepositoryModule
import com.example.daggerexample.scope.ActivityScope
import com.example.daggerexample.ui.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [UserRepositoryModule::class, NotificationServiceModule::class]
)
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
    }
}