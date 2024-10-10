/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E05
 */

import clases.Producto

/**
 * Función de extensión para filtrar productos por categoría en una lista
 * @param categoria
 * @return
 */
fun List<Producto>.filtrarPorCategoria(categoria: String): List<Producto> {
    return this.filter { it.categoria == categoria }
}

/**
 * Función de extesión que aplica un descuento a los productos
 * @param descuento
 */
fun List<Producto>.aplicarDescuento(descuento: Double) {
    this.forEach { it.precio -= it.precio * (descuento / 100) }
}

// Función para mostrar productos de una categoría específica
/**
 * Función que muestra los productos según su categoría
 * @param productos
 * @param categoria
 */
fun mostrarProductosPorCategoria(productos: List<Producto>, categoria: String) {
    println("Productos en la categoría $categoria:")
    productos.filtrarPorCategoria(categoria).forEach {
        println("Nombre: ${it.nombre}, Precio: ${it.precio}, Categoría: ${it.categoria}")
    }
}

/**
 * Aplica un descuento y muestra la lista actualizada
 * @param productos
 * @param descuento
 */
fun mostrarProductosConDescuento(productos: List<Producto>, descuento: Double) {
    println("\nAplicando un descuento del $descuento% a todos los productos...")
    productos.aplicarDescuento(descuento)
    productos.forEach {
        println("Nombre: ${it.nombre}, Precio con descuento: ${it.precio}, Categoría: ${it.categoria}")
    }
}

/**
 * Función principal
 */
fun main() {

    // Ceramos una lista con diversos productos
    val productos = listOf(
        Producto("Portátil", 1200.0, "Electrónica"),
        Producto("Teléfono Móvil", 800.0, "Electrónica"),
        Producto("Cafetera", 100.0, "Hogar"),
        Producto("Auriculares", 150.0, "Electrónica"),
        Producto("Sofá", 500.0, "Muebles"),
        Producto("Mesa de comedor", 300.0, "Muebles")
    )

    // Mostraoms los productos de la categoría "Electrónica"
    mostrarProductosPorCategoria(productos, "Electrónica")

    // Se aplica un descuento del 10% a todos los productos y
    // se muestra la lista actualizada
    mostrarProductosConDescuento(productos, 10.0)
}