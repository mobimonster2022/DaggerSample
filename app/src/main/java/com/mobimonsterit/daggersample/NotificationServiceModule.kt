package com.mobimonsterit.daggersample

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Provides
    fun getEmailNotification (@Named("test") retryCount1 : Int) : INotificationService
    {
        return EMailService(retryCount1)
    }
}