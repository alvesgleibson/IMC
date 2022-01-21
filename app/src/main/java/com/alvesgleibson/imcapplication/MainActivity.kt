package com.alvesgleibson.imcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Desativar a Toolbar dessa activite
        if ( supportActionBar != null ){
            supportActionBar!!.hide()
        }

        val btNCD = findViewById<Button>(R.id.btNeceCalorica)
        val btIMC = findViewById<Button>(R.id.btMassaCorporal)

        btNCD.setOnClickListener {
            val abrirNCD =  Intent(this, NecessidadeCalorica::class.java)
            startActivity( abrirNCD )

        }

        btIMC.setOnClickListener{

            val abrirIMC = Intent(this, IMCActivity::class.java)
            startActivity( abrirIMC )

        }
    }
}