/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E10
 */

fun main() {

    // Solicitamos un valor numérico
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull()

    // Comprobamos que el valor es correcto
    if (numero!=null) {
        if (numero >= 0) {

            var i = 1
            while ((i in 2..(numero/2)) && (numero%i!=0)) i++

            if (i >= (numero/2)) println("El número es primo")
            else                 println("El número no es primo")

        } else {
            println("Error: El valor debe ser positivo")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}





