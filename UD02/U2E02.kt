/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E02
 */

fun main() {

    // Solicitamos el nombre
    print("Introduce tu nombre: ")
    val nombre: String? = readLine()

    // Solicitamos el apellido
    print("Introduce tu nombre: ")
    val apellidos: String? = readLine()
    
    // Mostramos ambos en una única cadena
    println("$nombre $apellidos")
}