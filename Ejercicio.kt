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
            "El estudiante ${usuario.nombre} puede pedir prestado ${libro.titulo} durante una semana al ser un estudiante"
        }

        is Profesor -> {
            "El profesor ${usuario.nombre} puede pedir prestado ${libro.titulo} durante un mes al ser un profesor"
        }

        is Visitante -> {
            "El visitante ${usuario.nombre}} no puede pedir prestado ningún libro"
        }
    }
}




fun main(){


}