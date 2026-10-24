package org.mgordillo.app.jardin;

import org.mgordillo.app.hogar.*;
import static org.mgordillo.app.hogar.Persona.*;
import static org.mgordillo.app.hogar.ColorPelo.*;
//import static org.mgordillo.app.hogar.Persona.saludar;
//import static org.mgordillo.app.hogar.Persona.GENERO_FEMENINO;
//import static org.mgordillo.app.hogar.Persona.GENERO_MASCULINO;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Manuel");
        p.setApellido("Gordillo");
//        p.setColorPelo(ColorPelo.CAFE);
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());


        Perro perro = new Perro();
        perro.nombre = "toby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
//        String saludo = Persona.saludar();
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
//        String generoMujer = Persona.GENERO_FEMENINO;
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
