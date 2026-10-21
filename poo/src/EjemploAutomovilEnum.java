public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO,
                new Motor(2.0,TipoMotor.BENCINA),new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL),new Estanque(45));
        mazda.setTipo(TipoAutomovil.SEDAN);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");

            case COUPE->
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");

            case FURGON->
                System.out.println("Automovil Utilitario");

            case HATCHBACK->
                System.out.println("Es un automovil mediano compacto");

            case PICKUP->
                System.out.println("Camioneta");

            case SEDAN->
                System.out.println("Sedan");

            case STATION_WAGON->
                System.out.println("Automovil grande, con maleta grande");

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta:tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumPuertas() + ", ");
            System.out.println();
        }
    }
}
