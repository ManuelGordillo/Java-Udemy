import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO,
                new Motor(2.0, TipoMotor.BENCINA),new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5,TipoMotor.BENCINA), new Estanque(60));
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
