package com.mycompany.myoutfits.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mycompany.myoutfits.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_outfit)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}