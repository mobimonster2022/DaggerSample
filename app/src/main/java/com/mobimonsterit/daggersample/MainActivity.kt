package com.mobimonsterit.daggersample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil

import androidx.databinding.ViewDataBinding

import com.mobimonsterit.daggersample.databinding.ActivityMainBinding
import com.mobimonsterit.daggersample.ui.theme.DaggerSampleTheme
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

  //  @Inject
 //   lateinit var userS : UserRegistrationService
 //   @Inject lateinit var userRService : UserRegistrationService

    @Inject
    lateinit var userRegistrationService : UserRegistrationService



    lateinit var binding: ActivityMainBinding
 //   @Inject
  //  lateinit var userRegistrationService : UserRegistrationService

    init{
      //  var userRegOb= DaggerUserRegistrationComponent.builder().build()
        // userRegOb.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var userRegistrationComponent =  DaggerUserRegistrationComponent.factory().create(3,9)


        userRegistrationComponent.inject(this)

        


        userRegistrationService.registerUser("bhavipanwar","12345");

        }

}
