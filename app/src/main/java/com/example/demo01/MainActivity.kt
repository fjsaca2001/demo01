package com.example.demo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //pregunta1()
        //pregunta2()
        //pregunta3()
        pregunta4()
    }
    private fun pregunta1(){
        // Validar si una persona es mayor o menor de edad
        var edad = 18
        if (edad >= 18){
            println("La persona es mayor de edad")
        }else{
            println("La presona es menor de edad")
        }
    }

    private fun pregunta2(){
        // Tabla de multiplicacion de n numero de forma ascendente y descendente
        var n = 2
        println("Tabla Ascendente")
        for (x in 1..12){
            println("$n * $x = "+ n*x)
        }

        println("Tabla Descendente")
        for (x in 12 downTo 0){
            println("$n * $x = "+ n*x)
        }
    }

    private fun pregunta3(){

        // Mostrar el listado de paralelo de la materia de
        // plataformas moviles y los grupos por proyecto ( Ordenados)
        //

        var myMap: Map<String,String> = mapOf()

        //añadir elementos
        myMap= mutableMapOf("Frank" to "App turistica",
            "Juan" to "App turistica",
            "Miguel" to "App compras",
            "Luis" to "App compras",
            "Pedro" to "App turistica",
            "Andres" to "App turistica",
            "Manuel" to "App turistica",
            "Erick" to "App compras",
            "Jeferson" to "App compras",
            "David" to "App turistica")
        println("Listado de estudiantes")
        for (x in myMap.toSortedMap()){
            print (x.key + " - ")
        }

        println("\nListado de estudiantes de la App turistica")
        for (x in myMap.toSortedMap()){
            if (x.value == "App turistica"){
                print (x.key + "\n")
            }
        }

        println("\nListado de estudiantes de la App compras")
        for (x in myMap.toSortedMap()){
            if (x.value == "App compras"){
                print (x.key + "\n")
            }
        }
    }


    private fun pregunta4(){
        // Propiedades de un vehiculo
        val vehiculo1 = Vehiculo(marca = "Chevrolet",
            arrayOf(Vehiculo.Traccion.Automatica, Vehiculo.Traccion.Manual),
            arrayOf(Vehiculo.Motor.V4, Vehiculo.Motor.V8),
            arrayOf(Vehiculo.Tipo.Hatchback, Vehiculo.Tipo.Jeep),
            capacidad = "5 Personas", color = "Rojo")
        println(vehiculo1.marca)
        vehiculo1.vehiculo()

    }

}