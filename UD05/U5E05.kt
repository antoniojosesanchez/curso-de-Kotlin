/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U5E05
 */

fun main() {

    // definimos una lista para guardar las tareas
    val tareas = mutableListOf<String>()


    while (true) {

        // mostramos el menú
        mostrarMenu()

        // leemos la opción del usuario
        when (readlnOrNull()?.toIntOrNull()) {
            1 -> agregarTarea(tareas)
            2 -> eliminarTarea(tareas)
            3 -> listarTareas(tareas)
            4 -> contarTareas(tareas)
            5 -> {
                println("Saliendo del programa.")
                return // termina la ejecución del programa
            }
            else -> println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.")
        }
    }
}

/**
 * Muesta el menú en pantalla
 */
fun mostrarMenu() {

    println("\nGestor de Tareas")
    println("1. Agregar tarea")
    println("2. Eliminar tarea")
    println("3. Listar tareas")
    println("4. Contar tareas")
    println("5. Salir")
    print("Seleccione una opción (1-5): ")
}

/**
 * Se encarga de añadir una nueva tarea a la lista
 * @param tareas
 */
fun agregarTarea(tareas: MutableList<String>) {

    // solicitamos información sobre la tarea
    print("Ingrese el nombre de la tarea a agregar: ")
    val tarea = readlnOrNull()

    if (!tarea.isNullOrEmpty()) {
        tareas.add(tarea)
        println("Tarea '$tarea' agregada exitosamente.")
    } else {
        println("El nombre de la tarea no puede ser nulo o vacío.")
    }
}

/**
 * La función elimina la tarea según el criterio elegido
 * @param tareas
 */
fun eliminarTarea(tareas: MutableList<String>) {

    // preguntamos por el criterio
    println("Seleccione el método para eliminar la tarea:")
    println("1. Por nombre")
    println("2. Por índice")
    print("Seleccione una opción (1-2): ")

    when (readlnOrNull()?.toIntOrNull()) {
        1 -> {
            print("Ingrese el nombre de la tarea a eliminar: ")
            val tarea = readlnOrNull()
            if (tarea != null && tareas.remove(tarea)) {
                println("Tarea '$tarea' eliminada exitosamente.")
            } else {
                println("La tarea '$tarea' no fue encontrada.")
            }
        }
        2 -> {

            // Mostrar tareas con índices
            listarTareas(tareas)

            // preguntamos por el íncide
            print("Ingrese el índice de la tarea a eliminar: ")
            val indice = readlnOrNull()?.toIntOrNull()
            if (indice != null && indice in tareas.indices) {
                val tareaEliminada = tareas.removeAt(indice)
                println("Tarea '$tareaEliminada' eliminada exitosamente.")
            } else {
                println("Índice no válido. La tarea no fue encontrada.")
            }
        }
        else -> println("Opción no válida. Por favor, seleccione 1 o 2.")
    }
}

/**
 * Lista todas las tareas almacenadas
 * @param tareas
 */
fun listarTareas(tareas: MutableList<String>) {
    if (tareas.isEmpty()) {
        println("No hay tareas en la lista.")
    } else {
        println("Lista de tareas:")
        tareas.forEachIndexed { index, tarea ->
            println("$index: $tarea")
        }
    }
}

// Función para contar el número de tareas
/**
 * Muestra el total de tareas
 * @return
 */
fun contarTareas(tareas: MutableList<String>) = println("Número total de tareas: ${tareas.size}")