/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E05
 */

fun main() {

    // Solicitamos el primer número desde el teclado
    print("Introduce el primer número: ")
    val num1 = readLine()?.toDoubleOrNull()

    // Solicitamos el segundo número desde el teclado
    print("Introduce el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

    // Solicitamos el operador desde el teclado
    print("Introduce el operador (+, -, *, /): ")
    val operador = readLine()!!.first()

    // Verificamos que los números y el operador son válidos
    if (num1 != null && num2 != null) {
        val resultado = when (operador) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> if (num2 != 0.0) num1 / num2 else {
                        println("Error: División por cero")
                        return
                    }
            else -> {
                println("Error: Operador no válido")
                return
            }
        }
        
        // Mostramos el resultado de la operación
        println("El resultado de $num1 $operador $num2 es: $resultado")
    } else {
        println("Error: Entrada no válida")
    }
}