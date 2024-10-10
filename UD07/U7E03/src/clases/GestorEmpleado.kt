/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E03
 */

package clases

class GestorEmpleado {

    private val empleados: MutableMap<Int, Empleado> = mutableMapOf()

    /**
     * Agrega un nuevo empleado
     * @param id
     * @param nombre
     * @param apellido
     * @param salario
     */
    fun agregarEmpleado(id: Int, nombre: String, apellido: String, salario: Double) {
        if (empleados.containsKey(id)) {
            println("Ya existe un empleado con el ID: $id")
        } else {
            val nuevoEmpleado = Empleado(id, nombre, apellido, salario)
            empleados[id] = nuevoEmpleado
            println("Empleado agregado con éxito: $nuevoEmpleado")
        }
    }

    /**
     * El método elimina el empleado con ID dado
     * @param id
     */
    fun eliminarEmpleado(id: Int) {
        if (empleados.remove(id) != null) {
            println("Empleado con ID $id eliminado correctamente.")
        } else {
            println("No se encontró ningún empleado con el ID: $id")
        }
    }

    /**
     * Actualiza el salario del empleado
     * @param id
     * @param nuevoSalario
     */
    fun actualizarSalario(id: Int, nuevoSalario: Double) {
        val empleado = empleados[id]
        val mensaje = empleado?.let {
            it.salario = nuevoSalario
            "Salario actualizado para el empleado con ID $id: $empleado"
        } ?: "No se encontró ningún empleado con el ID: $id"

       println(mensaje)
    }

    /**
     * Muestra un listado de todos los empleados
     */
    fun listarEmpleados() {
        if (empleados.isNotEmpty()) {
            println("Lista de empleados:")
            empleados.values.forEach { println(it) }
        } else {
            println("No hay empleados registrados.")
        }
    }

    /**
     * Busca el empleado indicado
     * @param id
     * @return
     */
    fun buscarEmpleadoPorId(id: Int): Empleado? = empleados[id]?.also {
                                                    println("Empleado encontrado: $it")
                                                } ?: run {
                                                    println("No se encontró ningún empleado con el ID: $id")
                                                    null
                                                }
}