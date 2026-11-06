package org.mgordillo.ejemplo;
import org.mgordillo.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Manuel");
        alumno.setApellido("Gordillo");
        alumno.setInstitucion("Instituto Nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " +
                alumno.getApellido() + " " +
                alumno.getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura() + ": "
                + profesor.getNombre() + " " + profesor.getApellido());
    }
}
