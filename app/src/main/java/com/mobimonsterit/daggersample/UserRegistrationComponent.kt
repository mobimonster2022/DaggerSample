package com.mobimonsterit.daggersample

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@Component(modules= [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

//    fun inject(mainActivity: MainActivity)
//    fun UserRegistrationService() : UserRegistrationService
//    fun GetEmailServices() : EMailService

     fun inject(activity: MainActivity)

     @Component.Factory
     interface Factory{
          fun create(@Named("retryCount") @BindsInstance retryCount : Int,@Named("test") @BindsInstance test: Int) : UserRegistrationComponent
     }
}