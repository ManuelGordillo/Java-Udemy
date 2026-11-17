package org.mgordillo.ejemplo;

import org.mgordillo.pooherencia.Alumno;
import org.mgordillo.pooherencia.AlumnoInternacional;
import org.mgordillo.pooherencia.Persona;
import org.mgordillo.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("===== Creando Instancia de la clase Alumno =====");
        Alumno alumno = new Alumno("Manuel","Gordillo",38,"Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alumno@local.com");

        System.out.println("===== Creando Instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("international@hotmail.com");

        System.out.println("===== Creando Instancia de la clase Profesor =====");
        Profesor profesor = new Profesor("Luci","Perez","Matemáticas");
        profesor.setEdad(43);
        profesor.setEmail("profesor@teacher.com");

        System.out.println("==============================================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos en común del tipo Persona");
        System.out.println("Nombre: " + persona.getNombre() +
                ", apellido: " + persona.getApellido() +
                ", edad: " + persona.getEdad() +
                ", email: " + persona.getEmail());
        if ((persona instanceof Alumno)){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());

        }

        System.out.println("=======================================");

    }
}
