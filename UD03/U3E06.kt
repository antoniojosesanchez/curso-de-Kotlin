/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E06
 */

fun main() {

    // Mostramos los múltiplos de 3: solución I
    for(i in 3..100 step 3) println(i)

    // Mostramos los múltiplos de 3: solución II
    for(i in 1..100) if (i%3==0) println(i)

}