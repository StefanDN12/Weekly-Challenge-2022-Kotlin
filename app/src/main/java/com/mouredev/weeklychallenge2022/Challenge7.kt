package com.mouredev.weeklychallenge2022

import java.text.Normalizer
import java.util.regex.Pattern

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main (){
    contadorPalabras("el gato al rato, el rato a la cuerda, la cuerda al palo, daba el arriero a Sancho, Sancho a la moza, la moza a él, el ventero a la moza")
}


fun contadorPalabras(frase: String){
    var patronLimpia = "[^a-zA-Z0-9_\\s]".toRegex()
    var normalizer = Normalizer.normalize(frase, Normalizer.Form.NFD)
    var accentremoved = normalizer.replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "")
    var fraseModificada = accentremoved.replace(patronLimpia, "")
    var newStr:List<String> = fraseModificada.split("\\s+".toRegex())
    var howManyCounts = 0
    var hasheitoWuapoSae:HashMap<String, Int> = HashMap()
    
    newStr.forEach { primer ->
        newStr.forEach { segundo ->
            if(primer == segundo){
                howManyCounts++
            }
            hasheitoWuapoSae.put(primer,howManyCounts)
        }
        howManyCounts = 0
    }
    print(hasheitoWuapoSae)

}