package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.Float

class MainActivity : AppCompatActivity() {
    private lateinit var txtNumero1:EditText
    private  lateinit var txtNumero2:EditText
    private  lateinit var txtResultado:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumero1=findViewById(R.id.txtNumero1)
        txtNumero2=findViewById(R.id.txtNumero2)
        txtResultado=findViewById(R.id.txtResultado)

        txtResultado.isEnabled = false

        val btnSumar:Button=findViewById(R.id.btnSumar)
        val btnRestar:Button=findViewById(R.id.btnRestar)
        val btnMultiplicar:Button=findViewById(R.id.btnMultiplicar)
        val btnDividir:Button=findViewById(R.id.btnDividir)

        btnSumar.setOnClickListener { sumar() }
        btnRestar.setOnClickListener { restar() }
        btnMultiplicar.setOnClickListener { multiplicar() }
        btnDividir.setOnClickListener { dividir() }
    }
    private fun sumar() {
        if (validarCampoVacio()){
            txtResultado.setText("Faltan datos...")
        }else{
            var num1 = Float.parseFloat(txtNumero1.text.toString())
            var num2 = Float.parseFloat(txtNumero2.text.toString())
            var resultado = num1 + num2
            txtResultado.setText(resultado.toString())
        }
    }

    private fun restar() {
        if (validarCampoVacio()){
            txtResultado.setText("Faltan datos...")
        }else{
            var num1 = Float.parseFloat(txtNumero1.text.toString())
            var num2 = Float.parseFloat(txtNumero2.text.toString())
            var resultado = num1 - num2
            txtResultado.setText(resultado.toString())
        }
    }

    private fun multiplicar() {
        if (validarCampoVacio()){
            txtResultado.setText("Faltan datos...")
        }else{
            var num1 = Float.parseFloat(txtNumero1.text.toString())
            var num2 = Float.parseFloat(txtNumero2.text.toString())
            var resultado = num1 * num2
            txtResultado.setText(resultado.toString())
        }
    }

    private fun dividir() {
        if (validarCampoVacio()){
            txtResultado.setText("Faltan datos...")
        }else{
            var num1 = Float.parseFloat(txtNumero1.text.toString())
            var num2 = Float.parseFloat(txtNumero2.text.toString())
            if (num2.toInt() == 0){
                txtResultado.setText("¡Error!")
            }else{
                var resultado = num1 / num2
                txtResultado.setText(resultado.toString())
            }
        }
    }

    private fun validarCampoVacio(): Boolean {
        if (txtNumero1.text.toString().isEmpty() || txtNumero2.text.isEmpty()){
            return true
        }
        return false
    }
}