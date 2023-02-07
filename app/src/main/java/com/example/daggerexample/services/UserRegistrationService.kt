package com.example.daggerexample.services

import com.example.daggerexample.repo.UserRepository
import com.example.daggerexample.qualifier.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "test@example.com", "User registered")
    }
}

/*
* Unit testing
* Single Responsibility
* Lifetime of the object
* Extensible
 */