package com.example.daggerexample.component

import com.example.daggerexample.module.AnalyticsServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {

    //If Factory is defined return Factory else return the Component only.
    fun getUserRegistrationComponentBuilder(): UserRegistrationComponent.Builder
}