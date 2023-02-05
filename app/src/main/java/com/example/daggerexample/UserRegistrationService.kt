package com.example.daggerexample

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val emailService: EmailService,
    private val userRepository: UserRepository
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "test@example.com", "User registered")
    }
}

/*
* Unit testing
* Single Responsibility
* Lifetime of the object
* Extensible
 */