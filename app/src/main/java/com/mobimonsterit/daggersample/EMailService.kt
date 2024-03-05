package com.mobimonsterit.daggersample

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject


class EMailService (var aRetry : Int) : INotificationService {


    override fun send( to : String, from : String, msg: String) {
        // TODO("Email Sent")

        Log.w("result","Email sent $aRetry" )
    }
}