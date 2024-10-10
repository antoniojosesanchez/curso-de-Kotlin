import clases.Libro
import clases.Revista
import clases.Usuario

/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E02
 */

fun main() {

    // creamos una instancia de Libro
    val libro = Libro("1984", "George Orwell", 1949, disponible = true)

    // creamos una instancia de Revista
    val revista = Revista("National Geographic", "Varios", 2024, numeroEdicion = 5)

    // creamos una instancia de Usuario
    val usuario = Usuario(1, "Alicia Álvarez")

    // mostramos información del libro y revista
    libro.mostrarInformacion()
    revista.mostrarInformacion()

    // intentamos prestar el libro
    try {
        libro.prestar()
        libro.prestar()  // debería lanzar una excepción porque el libro ya está prestado
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // devolvemos el libro
    libro.devolver()

    // intentamos prestar el libro nuevamente después de devolverlo
    try {
        libro.prestar()
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // mostramos nuevamente la información del libro después de prestarlo y devolverlo
    libro.mostrarInformacion()

}