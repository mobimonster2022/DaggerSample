package com.mobimonsterit.daggersample

import android.util.Log
import javax.inject.Inject



class UserRepository @Inject constructor() : IUserRepository{
    override fun saveUser(msg : String, pass : String)
    {
        Log.w("result","user repository saved")
    }
}

class FirebaseRepository : IUserRepository{
    override fun saveUser(msg: String, pass: String) {
        Log.w("result","firebase respo saved")
    }

}