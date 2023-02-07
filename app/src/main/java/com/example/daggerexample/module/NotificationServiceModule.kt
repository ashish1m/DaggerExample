package com.example.daggerexample.module

import com.example.daggerexample.qualifier.MessageQualifier
import com.example.daggerexample.scope.ActivityScope
import com.example.daggerexample.services.EmailService
import com.example.daggerexample.services.MessageService
import com.example.daggerexample.services.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}