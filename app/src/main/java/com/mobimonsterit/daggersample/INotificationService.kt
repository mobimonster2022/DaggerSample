package com.mobimonsterit.daggersample

import android.content.Context

interface INotificationService {
    fun send(to : String, from : String, msg: String)
}