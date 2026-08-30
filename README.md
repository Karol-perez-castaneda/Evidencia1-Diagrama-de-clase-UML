# EA1 - Diagrama de Clases UML
## Sistema de Biblioteca

### Descripción

Este repositorio contiene el desarrollo de la actividad EA1,
correspondiente al diseño de un Diagrama de Clases UML para
un sistema de biblioteca.

## Integrantes

1. EMILSE CAVADIA TORDECILLA
2. CRISTIAN CAMILO DEOSSA BOLIVAR
3. JOSE WILBER MURILLO MURILLO
4. KAROL LICETH PEREZ CASTAÑEDA
5. NICOLE VALENTINA QUEVEDO FRANCO


## 📌 Información de la actividad

Actividad: EA1 – Diagrama de Clases UML

Tema: Sistema de Biblioteca

Asignatura: PROGRAMACIÓN II: ORIENTADA A OBJETOS AVANZADA - PREICA2602B010093

Docente: BORIS ALBERTO SALLEG

Grupo: 7

Fecha: 30/08/2026


## Objetivo

Diseñar un Diagrama de Clases UML para representar la estructura de un sistema de biblioteca, aplicando conceptos de Programación Orientada a Objetos y diferentes tipos de relaciones entre las clases.


## Descripción del proyecto

El proyecto representa un sistema básico de biblioteca en el que se gestionan libros, autores, usuarios y préstamos.

El modelo permite identificar las clases principales del sistema, sus atributos, métodos y las relaciones existentes entre ellas.

También se incluye la clase LibroDigital, que representa un tipo específico de libro mediante el uso de herencia.

El diagrama fue elaborado utilizando UML y PlantUML.


## Descripción del diagrama

El Diagrama de Clases UML está compuesto por las siguientes clases:


## Libro

Representa los libros disponibles en la biblioteca.

### Atributos:

. idLibro
. titulo
. isbn
. añoPublicacion
. estado

### Métodos:

. prestar()
. actualizarEstado()
. obtenerInfo() 


## Autor

Representa a los autores de los libros.

### Atributos:

. idAutor
. nombre
. nacionalidad 
. fechaNacimiento

### Métodos:

. escribirLibro()
. obtenerInfo()


## Usuario

Representa a las personas que utilizan el servicio de la biblioteca.

### Atributos:

. idUsuario
. nombre
. documento
. tipoUsuario

### Métodos:

. registrar()
. obtenerInfo()


## Préstamo

Representa el registro de los préstamos realizados en la biblioteca.

### Atributos:

. idPrestamo
. fechaPrestamo
. fechaDevolucion
. fechaDevolucionReal
. estado

### Métodos:

. registrar()
. devolver()
. calcularDiasAtraso()


## LibroDigital

Representa una especialización de la clase Libro.

### Atributos:

. formato
. tamañoArchivo
. urlDescarga
. protegido

### Métodos:

. descargar()
. leerEnLinea()


## EstadoDisponibilidad

Representa los diferentes estados en los que puede encontrarse un libro:

. DISPONIBLE
. PRESTADO
. RESERVADO
. EN_MANTENIMIENTO


# 🔗 Relaciones del diagrama
## Asociación

La asociación se representa entre Usuario y Préstamo.

Un usuario puede realizar cero o muchos préstamos.

Usuario "1" ───── "0..*" Préstamo


## Agregación

La agregación se representa entre Autor y Libro.

Un autor puede estar relacionado con cero o muchos libros.

Autor "1" ◇──── "0..*" Libro


## Composición

La composición se representa entre Libro y Préstamo.

Un libro puede tener cero o muchos registros de préstamo.

Libro "1" ◆──── "0..*" Préstamo


## Herencia

La herencia se representa entre Libro y LibroDigital.

LibroDigital hereda las características de Libro y agrega atributos y métodos propios.

Libro
  △
  
  |
  
LibroDigital


## Multiplicidades

Las multiplicidades permiten indicar cuántos objetos pueden participar en cada relación.

Multiplicidad	      Significado
1	                  Uno
0..1	              Cero o uno
0..*	              Cero o muchos
1..*	              Uno o muchos


## Conceptos de Programación Orientada a Objetos

### Abstracción

Permite representar las características necesarias de cada elemento del sistema sin incluir información que no sea relevante para el modelo.


### Encapsulamiento

Los atributos de las clases se representan como privados y los métodos como públicos, permitiendo organizar y proteger la información.


### Herencia

LibroDigital hereda características de Libro, permitiendo reutilizar atributos y comportamientos.


### Polimorfismo

Permite que un objeto de LibroDigital pueda ser tratado como un objeto de tipo Libro, manteniendo además sus comportamientos específicos.


## Principios SOLID

### S – Responsabilidad única

Cada clase tiene una responsabilidad específica dentro del sistema.

### O – Abierto/Cerrado

El sistema puede ampliarse mediante nuevas clases sin modificar completamente las clases existentes.

### L – Sustitución de Liskov

LibroDigital puede utilizarse como un Libro sin afectar el funcionamiento general del sistema.

### I – Segregación de interfaces

Las interfaces pueden diseñarse de manera específica para evitar que las clases dependan de métodos que no necesitan.

### D – Inversión de dependencias

El sistema puede utilizar abstracciones para disminuir la dependencia directa entre sus componentes.


# 💻 Trabajo colaborativo en GitHub

El proyecto fue desarrollado de manera colaborativa mediante GitHub.

Cada integrante participa en el desarrollo del proyecto utilizando su propia cuenta y realizando aportes mediante commits.


# Diagrama UML

El diagrama de clases completo se encuentra en la carpeta diagrama.

### Archivo: Diagrama_UML_Biblioteca_Grupo7.png


# Código PlantUML

El código utilizado para elaborar el diagrama se encuentra en la carpeta plantuml.

### Archivo: Codigo PlantUML.PDF


# 🎥 Video de presentación

# 🔗Enlace al video:
https://drive.google.com/file/d/16QTO7JstaKnW3YINzWOJpNELQYrKvnMW/view?usp=drivesdk 


# 🔗 Enlace al repositorio
https://github.com/Karol-perez-castaneda/Evidencia1-Diagrama-de-clase-UML.git

# 🔗 Enlace al Documento
https://drive.google.com/file/d/10xt2gp7s5A51lOUOzXbk249WCyo7InvC/view?usp=drive_link


# Conclusiones

El desarrollo del Diagrama de Clases UML permitió representar de manera organizada la estructura de un sistema de biblioteca.

Se identificaron las principales clases, sus atributos, métodos y relaciones, aplicando asociación, agregación, composición y herencia.

También se aplicaron conceptos de Programación Orientada a Objetos como abstracción, encapsulamiento y polimorfismo, además de los principios SOLID.

El uso de GitHub permitió organizar los archivos del proyecto y registrar los aportes realizados por los integrantes mediante el trabajo colaborativo.


# 🛠️ Herramientas utilizadas
. GitHub
. PlantUML
. UML
. Programación Orientada a Objetos
. OBS Studio


# 📚 Referencias

•	IBM. (2025). ¿Qué es la normalización de bases de datos? IBM Think. https://www.ibm.com/es-es/think/topics/database-normalization 

•	IBM. (s. f.). Normalization. IBM Documentation. https://www.ibm.com/docs/en/tpfdf/1.1.3?topic=database-normalization  

•	Oracle. (s. f.). About normalization. Oracle Database Data Warehousing Guide. https://docs.oracle.com/en/database/oracle/oracle-database/19/dwhsg/data-warehouse-logical-design.html 

•	Otaduy, I. (s. f.). Ingeniería del software: Bloque II: UML (1) [Archivo PDF]. Universidad del País Vasco / Euskal Herriko Unibertsitatea. http://www.vc.ehu.es/jiwotvim/IngenieriaSoftware/Teoria/BloqueII/UML-1.pdf 

•	Miro. (s. f.). ¿Qué es un diagrama UML? https://miro.com/es/diagrama/que-es-diagrama-uml/ 
