package com.mobimonsterit.daggersample

import javax.inject.Inject

class MessageHandler @Inject constructor() {

    fun messageSent(msg : String)
    {
        println(msg + "sent")
    }
}