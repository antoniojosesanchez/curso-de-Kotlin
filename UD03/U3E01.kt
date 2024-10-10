/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E01
 */

fun main() {

    // Solicitamos la edad por teclado
    print("Introduce tu edad: ")
    val edad = readLine()!!.toInt()

    // Mostramos si es menor de edad, está en activo o jubilado
    if (edad < 0) println("La edad es incorrecta")
    else
        if      (edad < 18) println("Eres menor de edad")
        else if (edad < 65) println("Estás en activo")
        else                println("Estás jubilado")
}