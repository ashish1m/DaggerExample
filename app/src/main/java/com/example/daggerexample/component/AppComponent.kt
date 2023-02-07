package com.example.daggerexample.component

import com.example.daggerexample.module.AnalyticsServiceModule
import com.example.daggerexample.services.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {
    fun getAnalyticsService(): AnalyticsService
}