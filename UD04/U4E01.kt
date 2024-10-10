/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E01
 */

fun main() {

    // solicitamos las palabras al usuario
    println("Introduce 5 palabras:")
    val cadenas:Array<String> = Array(5) { readLine()!! }

    // preguntamos si se deben escribir todas en una misma línea o en varias
    print("¿Se deben mostrar en varias líneas? (S|N): ")
    val opcion:String = readLine()!!.uppercase()

    // mostramos las palabras
    escribir(cadenas, opcion.equals("S"))
}

/**
 * @param cadenas
 * @param sl
 * @return String
 */
fun escribir(cadenas: Array<String>, sl: Boolean = false): Unit
{
    for(indice in cadenas.indices) {
        if (sl) println(cadenas[indice])
        else print("${cadenas[indice]}" + if (indice < cadenas.size - 1) ", " else "")

    }
}