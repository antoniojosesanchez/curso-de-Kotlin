/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E03
 */

fun main() {

    // Solicitamos un número
    print("Introduce un número: ")
    val a:Int = readLine()!!.toInt()
    
    // Solicitamos el segundo número
    print("Introduce otro número: ")
    val b:Int = readLine()!!.toInt()
    
    // Mostramos el resultado de las operaciones
    println("Suma: ${a + b}")
    println("Resta: ${a - b}")
    println("Producto: ${a * b}")
    println("División: ${a / b}")
}