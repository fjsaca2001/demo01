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
        //pregunta4()
        //trabajoEnClase1()
        //trabajoEnClase2()

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

    private fun trabajoEnClase1(){
        // Ordenar un arreglo
        var array = arrayOf(5,8,7,9,1,0,5,7,9)
        var aux=0
        // Metodo Burbuja
        for(i in (0 until array.size-1)){
            for(j in (0 until array.size-1)){
                if(array[j]>array[j+1]){
                    aux=array[j]
                    array[j]=array[j+1]
                    array[j+1]=aux
                }
            }
        }
        //Impresion del arreglo
        for (x in array){
            println(x)
        }
    }

    private fun tabajoEnClase2(){
        /* Validacion de cedula*/
        //var cedula = arrayOf(1,1,0,5,8,8,6,1,2,8)
        //var cedula = arrayOf(1,1,0,6,0,0,0,1,8,3)
        var cedula = arrayOf(1,1,5,0,0,3,0,6,3,1)
        var validadores = arrayOf(2,1,2,1,2,1,2,1,2)
        var contador = 0
        var suma = 0
        //recorrido de cada numero de la cedula
        for (x in validadores){
            // Multiplicacion del validador por el numero
            var res = x * cedula[contador]
            contador += 1
            // Condicion si la multiplicacion supera el 9
            if (res > 9){
                // paso del numero a String
                var aux1 = res.toString()
                // Suma de los dos valores
                res = Character.getNumericValue(aux1.get(0)) + Character.getNumericValue(aux1.get(1))
            }
            // Suma total
            suma += res
        }
        /*
            Condicion para validar el ultimo numero Si el residuo es 0 se validara,
            Ó si es diferente se tendra que a 10 restarle el residuo
         */
        if (cedula[9] == (suma % 10) || cedula[9] == 10 - (suma % 10)){
            println("Cedula Correcta")
        }else{
            println("Cedula Incorrecta")
        }
    }

}