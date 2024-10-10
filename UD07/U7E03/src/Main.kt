/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E03
 */

import clases.GestorEmpleado

fun main() {

    val gestor = GestorEmpleado()

    while (true) {

        // mostraoms el menú
        mostrarMenu()

        // leemos la opción del usuario
        when (readln().toInt()) {

            // Agregar empleado -----------------------------------
            1 -> {
                print("Ingresa ID del empleado: ")
                val id = readln().toInt()
                print("Ingresa nombre del empleado: ")
                val nombre = readln()
                print("Ingresa apellido del empleado: ")
                val apellido = readln()
                print("Ingresa salario del empleado: ")
                val salario = readln().toDouble()

                gestor.agregarEmpleado(id, nombre, apellido, salario)

            }

            // Eliminar empleado ----------------------------------
            2 -> {
                print("Ingresa ID del empleado a eliminar: ")
                val id = readln().toInt()
                gestor.eliminarEmpleado(id)
            }

            // Actualizar salario ---------------------------------
            3 -> {
                print("Ingresa ID del empleado cuyo salario deseas actualizar: ")
                val id = readln().toInt()
                print("Ingresa el nuevo salario: ")
                val nuevoSalario = readln().toDouble()
                gestor.actualizarSalario(id, nuevoSalario)
            }

            // Listar empleados -----------------------------------
            4 -> {
                gestor.listarEmpleados()
            }

            // Buscar empleado ------------------------------------
            5 -> {
                print("Ingresa ID del empleado que deseas buscar: ")
                val id = readln().toInt()
                gestor.buscarEmpleadoPorId(id)
            }

            // Salir del programa ---------------------------------
            6 -> {
                println("Saliendo del sistema de gestión de empleados.")
                break
            }

            // Opción incorrecta ----------------------------------
            else -> println("Opción no válida, por favor selecciona una opción válida.")
        }
    }
}

/**
 * Muestra el menú en pantalla
 * @return
 */
fun mostrarMenu(): Unit {

    println("\nMenú de opciones:")
    println("1. Agregar empleado")
    println("2. Eliminar empleado")
    println("3. Actualizar salario de un empleado")
    println("4. Listar todos los empleados")
    println("5. Buscar empleado por ID")
    println("6. Salir")
    print("Selecciona una opción: ")
}