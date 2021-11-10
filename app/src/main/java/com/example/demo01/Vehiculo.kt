package com.example.demo01

class Vehiculo (var marca: String, val traccion: Array<Traccion>, val motor: Array<Motor>, val tipo: Array<Tipo>, var capacidad: String, var color: String){
    enum class Traccion{
        Automatica,
        Manual
    }

    enum class Motor{
        V4,
        V6,
        V8
    }

    enum class Tipo{
        Sedan,
        Jeep,
        Hatchback
    }


    fun vehiculo(){


        println("Marca: "+ marca)
        println("Capacidad: "+ capacidad)
        println("Color: "+ color)

        for (t in traccion){
            println("Traccion: "+ t)
        }

        for (m in motor){
            println("Motor: "+ m)
        }

        for (t in tipo){
            println("Tipo: "+ t)
        }
    }
}