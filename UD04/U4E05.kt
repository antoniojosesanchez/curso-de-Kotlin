/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E05
 */

import kotlin.random.Random

fun main() {

    // creamos una rray numérico
    val numeros = Array(5) { Random.nextInt(1, 200) }


    for(item in numeros) {

        // mostramos el número
        print("$item: ")

        // indicamos si es o no primo
        print(if(item.esPrimo()) "es primo" else "no es primo")

        // mostramos si es o no capicúa
        print(if(item.esCapicua()) ", es capicúa" else ", no es capicúa")

        // mostramos los dígitos que tiene
        print(", tiene ${item.digitos()} digitos")

        // lo mostramos invertido
        print(", ${item.invertir()}")

        // mostramos los dígitos
        println(", ${item.palabras()}")
    }
}

/**
 * Comprueba si un número es o no capicúa
 * @param this
 * @return
 */
fun Int.esCapicua():Boolean = this.toString() == this.toString().reversed()

/**
 * Cuenta el número de dígitos de una cifra
 * @param this
 * @return
 */
fun Int.digitos(): Int = this.toString().length

/**
 * Invierte el número
 * @param this
 * @return
 */
fun Int.invertir():Int = this.toString().reversed().toInt()

/**
 * Devuelve una cadena con el nombre de los dígitos que
 * conforman la cifra numérica.
 * @param this
 * @return
 */
fun Int.palabras():String {

    var numero:Int = this.invertir()
    var salida:String = ""

    while(numero > 0) {

        salida += nombreDigito(numero%10)

        numero/=10
        salida += if (numero!=0) "," else ""
    }

    return salida
}


/**
 * Devuelve el nombre de un dígito
 * @param numero
 * @return
 */
fun nombreDigito(numero: Int):String =
    when(numero) {
        1    -> "uno"
        2    -> "dos"
        3    -> "tres"
        4    -> "cuatro"
        5    -> "cinco"
        6    -> "seis"
        7    -> "siete"
        8    -> "ocho"
        9    -> "nueve"
        else -> "cero"
    }
