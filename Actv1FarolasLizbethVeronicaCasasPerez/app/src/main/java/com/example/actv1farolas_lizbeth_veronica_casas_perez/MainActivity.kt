package com.example.actv1farolas_lizbeth_veronica_casas_perez

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    EditTex


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val txtResult = findViewById<TextView>(R.id.txtResult)



        /*button.setOnClickListener{
            Toast.makeText(context: this, text "Dar click", Toast.LENGTN_LONG).show();)
            txtResult.text = "Resultado"*/
        }

    fun Calculate(view: View) {}
}

    fun Calculate() {
        val plaza: Int = 100
        val x = 3.1416
        val v: Int = 22
        var r: Double

        if (plaza <= 300) {
            r = plaza * plaza * x - v

        }

        }




