/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E16
 */

fun main() {

	// Creamos el array
    val valores = arrayOf("campamento", "cardinales", "polen", null, "hoja","hermana", "relatividad", null)

    // Mostramos la longitud de cada cadena
    for(item:String? in valores) {
        if (item!=null) println("$item: ${item.length}")
    }
}





