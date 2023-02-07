package com.example.daggerexample.component

import com.example.daggerexample.module.AnalyticsServiceModule
import dagger.Component

@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {

}