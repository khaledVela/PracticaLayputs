package com.moviles.practicalayputs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var cero: Button
    private lateinit var uno: Button
    private lateinit var dos: Button
    private lateinit var tres: Button
    private lateinit var cuatro: Button
    private lateinit var cinco: Button
    private lateinit var seis: Button
    private lateinit var siete: Button
    private lateinit var ocho: Button
    private lateinit var nueve: Button
    private lateinit var mas: Button
    private lateinit var menos: Button
    private lateinit var por: Button
    private lateinit var div: Button
    private lateinit var igual: Button
    private lateinit var clear: Button
    private lateinit var clearall: Button
    private lateinit var pantalla:TextView
    private var contenido=""
    private var tipo=""
    private var primerint=0
    private var segundoint=0
    private var respuesta=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pantalla=findViewById(R.id.pantalla)
        cero=findViewById(R.id.btn0)
        uno=findViewById(R.id.btn1)
        dos=findViewById(R.id.btn2)
        tres=findViewById(R.id.btn3)
        cuatro=findViewById(R.id.btn4)
        cinco=findViewById(R.id.btn5)
        seis=findViewById(R.id.btn6)
        siete=findViewById(R.id.btn7)
        ocho=findViewById(R.id.btn8)
        nueve=findViewById(R.id.btn9)
        mas=findViewById(R.id.btnmas)
        menos=findViewById(R.id.btnmenos)
        por=findViewById(R.id.btnpor)
        div=findViewById(R.id.btndiv)
        igual=findViewById(R.id.btnigual)
        clear=findViewById(R.id.btnc)
        clearall=findViewById(R.id.btnce)
        pantalla.text="0"
        setupListeners()
    }

    private fun setupListeners() {
        uno.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=1
            pantalla.text=contenido}
        dos.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=2
            pantalla.text=contenido}
        tres.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=3
            pantalla.text=contenido}
        cuatro.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=4
            pantalla.text=contenido}
        cinco.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=5
            pantalla.text=contenido}
        seis.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=6
            pantalla.text=contenido}
        siete.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=7
            pantalla.text=contenido}
        ocho.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=8
            pantalla.text=contenido}
        nueve.setOnClickListener{
            if(contenido=="0")contenido=""
            contenido+=9
            pantalla.text=contenido}
        cero.setOnClickListener{
            if(pantalla.text!="0"||contenido!="0"){
                contenido+=0
            }
            pantalla.text=contenido}
        mas.setOnClickListener {
            primerint=contenido.toInt()
            contenido=""
            tipo="mas"
            pantalla.text=contenido
        }
        menos.setOnClickListener {
            primerint=contenido.toInt()
            contenido=""
            tipo="menos"
            pantalla.text=contenido
        }
        por.setOnClickListener {
            primerint=contenido.toInt()
            contenido=""
            tipo="por"
            pantalla.text=contenido
        }
        div.setOnClickListener {
            primerint=contenido.toInt()
            contenido=""
            tipo="div"
            pantalla.text=contenido
        }
        igual.setOnClickListener {
            segundoint=contenido.toInt()
            contenido=""
            if(tipo=="mas"){
                respuesta=primerint+segundoint
            }
            if(tipo=="menos"){
                respuesta=primerint-segundoint
            }
            if(tipo=="por"){
                respuesta=primerint*segundoint
            }
            if(tipo=="div"){
                respuesta=primerint/segundoint
            }
            contenido= respuesta.toString()
            pantalla.text=contenido
        }
        clear.setOnClickListener {
            contenido=""
            pantalla.text="0"
        }
        clearall.setOnClickListener {
            primerint=0
            segundoint=0
            tipo=""
            contenido=""
            pantalla.text="0"
        }
    }
}