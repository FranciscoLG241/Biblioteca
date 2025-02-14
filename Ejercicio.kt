import kotlin.io.path.fileVisitor

sealed class Usuario(open val id: String, open val nombre: String)


data class Estudiante(override val id: String, override val nombre: String, val curso: String): Usuario(id, nombre)
data class Profesor(override val id: String, override val nombre: String, val curso: String): Usuario(id, nombre)
data class Visitante(override val id: String, override val nombre: String, val curso: String): Usuario(id, nombre)



data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int)
data class Revista(val titulo: String, val issue: Int, val anio: Int)
data class DVD(val titulo: String, val director: String, val anio: Int)




fun pedirLibro(usuario: Usuario, libro: Libro): String{
    return when (usuario){
        is Estudiante -> {
            "El/La estudiante ${usuario.nombre} puede pedir prestado ${libro.titulo} durante una semana al ser un estudiante"
        }

        is Profesor -> {
            "El/La profesor ${usuario.nombre} puede pedir prestado ${libro.titulo} durante un mes al ser un profesor"
        }

        is Visitante -> {
            "El/La visitante ${usuario.nombre} no puede pedir prestado ningún libro"
        }
    }
}




fun main(){

    val estudiante1 = Estudiante("1", "Julio", "1ºDAM")
    val profesor1 = Profesor("2", "Juan", "2º DAM")
    val visitante1 = Visitante("3", "Lucía", "Desconocido")

    val libro1 = Libro("Título de Títulos", "George", 1987)


    println(pedirLibro(estudiante1, libro1))
    println(pedirLibro(profesor1, libro1))
    println(pedirLibro(visitante1, libro1))
}