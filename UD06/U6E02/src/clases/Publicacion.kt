/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E02
 */

package clases

abstract class Publicacion(val titulo: String, val autor: String, val anioPublicacion: Int) {
    abstract fun mostrarInformacion()
}
