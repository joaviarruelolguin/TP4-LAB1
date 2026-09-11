/*
Un Alumno tiene un nro. de legajo, un apellido, un nombre y una lista HashSet de materias en las
que está inscripto; para ello tiene un método agregarMateria que permite inscribir al Alumno en
una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos
materias iguales.) y otro método cantidadMaterias que devuelve la cantidad de materias a las que
está inscripto el alumno.
❖ La Materia tendrá un idMateria, un nombre de la materia y el año al que pertenece, tiene además un
constructor que inicializa suspropiedades y métodos get y set para c/u de sus atributos.
Se pide:
❖ En el método main de una clase de nombre Colegio:

1. Crear las materias:
a. Web 2 de segundo año.
b. Matemáticas de primer año.
c. Laboratorio 1 de primer año

2. Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.

3. Inscribir a López en las 3 materias.
4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.

5. Visualizar la cantidad de materias a las que está inscripto cada alumno.

CREAR EN LA VISTA PRINCIPAL 2 HashSet que serán STATIC.

1. HashSet <Alumno> A COMPARTIR con vista Alumnos y Vista Inscripción
2. HashSet <Materia> A COMPARTIR con vista Materias y Vista Inscripción
3. Al invocar el constructor de los JinternalFrame, pase los SET como
argumentos, para cargarlos o mostrarlos.
• Crear un JFrame, luego arrastre un JDesktopPane, que llamaremos ”escritorio”
• Para vistas internas y sugeridas de las funcionalidades utilice JInternalFrame
(y que sean accedidas desde un menú principal): Alta de Materias, Alta de
Alumnos y Formulario de Inscripción.
 Arrastre una JMenuBar, y Utilice 4 JMenu, y JmenuItems para hacer un new de
VistaAlumnos, VistaMaterias, V. Incripcion, y Salir


*/

package com.mycompany.trabajopractico4.lab1;

public class TrabajoPractico4LAB1 {

    public static void main(String[] args) {
    }
}
