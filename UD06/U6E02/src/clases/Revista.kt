/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E02
 */

package clases

class Revista(titulo: String, autor: String, anioPublicacion: Int, var numeroEdicion: Int) : Publicacion(titulo, autor, anioPublicacion) {

    /**
     * Muestra información de la revista
     * @return
     */
    override fun mostrarInformacion() = println("Revista: $titulo, Autor: $autor, Año: $anioPublicacion, Número de Edición: $numeroEdicion")

}