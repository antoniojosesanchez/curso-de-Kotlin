/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E06
 */

fun main() {

    // Solicitamos la cadena
    print("Introduce una cadena: ")
    val nombre: String? = readLine()!!
    
    // Solicitamos el inicio y fin del intervalo
    print("Introduce el inicio del intervalo: ")
    val a = readLine()?.toInt() ?: 0
    
    print("Introduce el final del intervalo: ")
    val b = readLine()?.toInt() ?: nombre?.length

    // Mostramos la subcadena
    println(nombre?.substring(a.rangeTo(b!!)))
}