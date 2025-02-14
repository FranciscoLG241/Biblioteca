sealed class Usuario(open val id: String, open val nombre: String){

}



data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int, override val id: String,
                 override val nombre: String): Usuario(id, nombre){

}


data class Revista(val titulo: String, val issue: Int, val anio: Int, override val nombre: String,
                   override val id: String): Usuario(id, nombre){

}



data class DVD(val titulo: String, val direcctor: String, val anio: Int, override val id: String,
               override val nombre: String): Usuario(id, nombre){

}