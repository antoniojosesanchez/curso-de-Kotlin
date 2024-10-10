/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E02
 */

fun main() {

    // Solicitamos la edad por teclado
    print("Introduce tu edad: ")
    val edad = readLine()!!.toInt()

    // Mostramos si es menor de edad, está en activo o jubilado
    val mensaje = when {
        edad <= 0 -> "La edad es incorrecta"
        edad < 18 -> "Eres menor de edad"
        edad < 65 -> "Estás en activo"
        else      -> "Estás jubilado"
    }
    
    println(mensaje)
}