package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
        val pesoStr: String = edtPeso.text.toString()
        val alturaStr: String = edtaltura.text.toString()

         if (pesoStr == "" || alturaStr == ""){
             Snackbar.make(
             edtPeso,
            "Preencha todo os campos",
             Snackbar.LENGTH_LONG
             )
             .show()

              }else{
                  val peso = pesoStr.toFloat()
                  val altura = alturaStr.toFloat()

                  val altura2 = altura * altura
                  val resultado = peso / altura2
                  println(" IMC " + resultado)

              }
        }
    }
 }