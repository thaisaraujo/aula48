package com.example.firebasenotificationaula48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.InstanceIdResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //gerar token
        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(
            this
        ) { instanceIdResult: InstanceIdResult ->
            val newToken = instanceIdResult.token
            Log.e("newToken", newToken)
        }

    }
}