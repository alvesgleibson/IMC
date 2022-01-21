package com.alvesgleibson.imcapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class NecessidadeCalorica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_necessidade_calorica)

        supportActionBar?.apply {

            //Adicionando o botão de voltar na Toolbar(Tem que ativar no AndroidManifest -> android:parentActivityName=".MainActivity")
            setDisplayHomeAsUpEnabled( true )



        }





    }
}