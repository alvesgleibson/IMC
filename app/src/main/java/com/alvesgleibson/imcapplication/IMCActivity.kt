package com.alvesgleibson.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IMCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        supportActionBar!!.setDisplayHomeAsUpEnabled( true )
    }
}