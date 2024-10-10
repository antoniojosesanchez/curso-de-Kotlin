/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E06
 */

fun main() {

    // solicitamos un valor numérico por teclado
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    // mostramos el resultado en Código Morse
    println("El $numero es el ${morse(numero)} en morse.")
}

/**
 * Devuelve una cadena con el número convertido a código Morse
 * @param numero
 * @return
 */
fun morse(numero:Int):String {

    var cifra = numero.toString().toCharArray()
    var salida:String = ""

    for(digito in cifra) salida += digitoMorse(digito.digitToInt())
    return salida
}

/**
 * Devuelve el nombre de un dígito
 * @param numero
 * @return
 */
fun digitoMorse(numero: Int):String =
    when(numero) {
        1    -> ".----"
        2    -> "..---"
        3    -> "...--"
        4    -> "....-"
        5    -> "....."
        6    -> "-...."
        7    -> "--..."
        8    -> "---.."
        9    -> "----."
        else -> "-----"
    }