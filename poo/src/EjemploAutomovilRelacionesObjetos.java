public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","Bt-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        System.out.println("mazda.fabricante: " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5,TipoMotor.BENCINA),new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
//        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

    }
}
