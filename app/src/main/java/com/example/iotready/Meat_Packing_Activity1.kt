package com.example.iotready

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Meat_Packing_Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meat_packing1)
    }
        override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)

            if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                setContentView(R.layout.activity_meat_packing2)
            } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
                setContentView(R.layout.activity_meat_packing1)
            }
        }

}