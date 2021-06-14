package com.example.irem

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.irem.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val networkInfo = cm.activeNetworkInfo
        if ( networkInfo!= null && networkInfo.isConnected){
            if (networkInfo.type== ConnectivityManager.TYPE_WIFI)
            {
                Toast.makeText(this, "Wifi Bağlantısı Sağlandı", Toast.LENGTH_SHORT ).show()
            }
            if (networkInfo.type== ConnectivityManager.TYPE_MOBILE)
            {
                Toast.makeText(this, "Mobil Bağlantısı Sağlandı", Toast.LENGTH_SHORT ).show()
            }
        } else{
            Toast.makeText(this, "İnternet bağlantısı yok", Toast.LENGTH_SHORT ).show()
        }
    }
}