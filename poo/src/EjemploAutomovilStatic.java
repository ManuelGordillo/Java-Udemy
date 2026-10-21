import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO,2.0,40);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0,40);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS, 3.5,50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS, 3.5,50);
        Automovil auto = new Automovil();
        Automovil.setColorPatente("Azul");


        System.out.println(subaru.verDetalle());
        System.out.println("-------------------------");
        System.out.println(mazda.verDetalle());
        System.out.println("-------------------------");
        System.out.println(nissan.verDetalle());
        System.out.println("-------------------------");
        System.out.println(nissan2.verDetalle());
        System.out.println("Kilómetros por litro: " + Automovil.calcularConsumoEstatico(300,60));


        System.out.println("Velocidad máxima carretera: "+ Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad en ciudad: "+ Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}
