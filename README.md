# Ejercicio 5: Sistema de Gestión de Biblioteca¶
- Imagina que estás construyendo un sistema para una biblioteca que gestiona libros y usuarios. Este sistema deberá poder manejar distintos tipos de items en la biblioteca (libros, revistas, DVDs) y distintos tipos de usuarios (estudiante, profesor, visitante).

## Parte 1: Definir data class

- Libro: Título (String), Autor (String) y Año de Publicación (Int)

- Revista: Título (String), Issue (Int), Año (Int)

- DVD: Título (String), Director (String), Año (Int)

- Estas clases almacenarán la información básica de cada ítem en la biblioteca. Usa data class para definir estas clases ya que son perfectas para almacenar datos sin necesidad de lógica adicional.

## Parte 2: Definir sealed class

- Para gestionar los distintos tipos de usuarios, puedes usar una sealed class. Esto te permitirá tener una jerarquía de clases cerrada, lo cual es útil para cuando se conocen todos los posibles subtipos.

1. Usuario
2. sealed class Usuario
3. Clases que heredan de Usuario:
4. Estudiante(id:String, nombre:String, carrera:String)
5. Profesor(id:String, nombre:String, departamento:String)
6. Visitante(id:String, nombre:String)
7. La sealed class Usuario permitirá manejar operaciones específicas para cada tipo de usuario, como préstamos de libros o acceso a áreas restringidas de la biblioteca.

## Ejercicio Propuesto:

- Definir las data class para Libro, Revista, y DVD.
- Crear una sealed class Usuario con las subclases Estudiante, Profesor, y Visitante. Cada subclase debe tener propiedades relevantes (como se describió anteriormente).
- Implementar una función que acepte un Usuario y un libro, y devuelva un mensaje indicando si el usuario puede o no tomar prestado el libro. Considerar reglas simples como que los Visitantes no pueden tomar prestados libros, o que los Profesores pueden tener préstamos por más tiempo.








