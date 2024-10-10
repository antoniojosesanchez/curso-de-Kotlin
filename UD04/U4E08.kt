/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E08
 */

fun main() {

    // solicitamos el valor de la altura
    print("Introduce la altura: ")
    val altura = readLine()!!.toInt()

    // mostramos la figura en pantalla si la altura es mayor o igual a 3
    if (altura < 3) println("La altura es incorrecta. Debe ser un valor mayor o igual a 3.")
    else {
        // solicitamos el símbolo
        print("Introduce el símbolo: ")
        val simbolo = readLine()
        
        // dibujamos
        dibujar(altura, if(simbolo.isNullOrEmpty()) '*' else simbolo.first())
    }

}

/**
 * Dibuja la figura solicitada
 * @param altura
 */
fun dibujar(altura: Int, simbolo:Char) {

    for (fila in 1 until altura) {
        print(linea(simbolo, fila))
        print(linea(' ', altura * 2 - fila * 2 - 1))
        println(linea(simbolo, fila))
    }

    println(linea(simbolo, altura * 2 - 1))
}

/**
 * Genera una cadena de tantos símbolos como se indique
 * @param simbolo
 * @param reps
 * @return
 */
fun linea(car:Char, reps:Int ):String? {

    var salida: String? = ""
    for (i in 0 until reps) salida += car
    return salida
}