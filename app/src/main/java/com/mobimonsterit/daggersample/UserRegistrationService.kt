package com.mobimonsterit.daggersample

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    var repository: IUserRepository,
    var messageHandler: INotificationService
) {


    fun registerUser(email : String, password : String) {
        repository.saveUser(email,password)
        messageHandler.send(email,"donotreply@godade.com","User Registered")

    }

}