/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E02
 */

package clases

class Libro(titulo: String, autor: String, anio: Int, var disponible: Boolean = true) : Publicacion(titulo, autor, anio), Prestable {

    /**
     * Presta el ejemplar si está disponible
     * @return
     */
    override fun prestar() {
        if (!disponible) throw Exception("El libro «$titulo» no está disponible para ser prestado.")

        disponible = false
        println("El libro «$titulo» ha sido prestado")
    }

    /**
     * Devuelve el ejemplar si está prestado
     * @return
     */
    override fun devolver() {
       disponible = true
       println("El libro «$titulo» ha sido devuelto y ahora está disponible.")
    }

    /**
     * Muestra información completa sobre el libro.
     * @return
     */
    override fun mostrarInformacion() {
        println("Libro: $titulo, Autor: $autor, Año: $anioPublicacion")
        println("Estado: " + if (disponible) "disponible" else "prestado")
    }
}