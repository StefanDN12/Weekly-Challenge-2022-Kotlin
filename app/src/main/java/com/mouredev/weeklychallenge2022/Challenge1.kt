package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {

    println( Anagrama("Acuerdo", "recaudo"))
}

//Arroz y Zorra

fun Anagrama(palabra1:String, palabra2:String):Boolean{
    var comprobador = false;

    val arr1 = Array(palabra1.length){palabra1[it].toString().uppercase()}
    val arr2 = Array(palabra2.length){palabra2[it].toString().uppercase()}
    if(!palabra1.equals(palabra2)){
        if(palabra1.length == palabra2.length){
            arr1.sort()
            arr2.sort()
           comprobador=arr1 contentEquals arr2
        }
    }


    return comprobador
}
