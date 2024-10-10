/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E07
 */

fun main() {

    // solicitamos el valor de la altura
    print("Introduce la altura: ")
    val altura = readLine()!!.toInt()

    // mostramos la figura en pantalla si la altura es mayor o igual a 3
    if (altura >= 3) dibujar(altura)
    else println("La altura es incorrecta. Debe ser un valor mayor o igual a 3.")
}

/**
 * Dibuja la figura solicitada
 * @param altura
 */
fun dibujar(altura: Int) {

    for (fila in 1 until altura) {
        print(linea('*', fila))
        print(linea(' ', altura * 2 - fila * 2 - 1))
        println(linea('*', fila))
    }

    println(linea('*', altura * 2 - 1))
}

/**
 * Genera una cadena de tantos símbolos como se indique
 * @param simbolo
 * @param reps
 * @return
 */
fun linea(simbolo:Char, reps:Int ):String? {

    var salida: String? = ""
    for (i in 0 until reps) salida += simbolo
    return salida
}