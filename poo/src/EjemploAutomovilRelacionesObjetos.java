public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Lucy","Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
//        subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama",16,7.5));
        }

        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda","Bt-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin",18,8.5));
        }


        Rueda[] ruedasNissan = new Rueda[5];
        for (int i = 0; i < ruedasNissan.length; i++) {
            ruedasNissan[i] = new Rueda("Pirelli",20,11.5);
        }
        Persona bea = new Persona("Bea","Gonzales");
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50),bea,ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i < ruedasNissan2.length; i++) {
            ruedasNissan2[i] = new Rueda("Pirelli",20,13.5);
        }
        Persona lalo = new Persona("Lalo","Mena");
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5,TipoMotor.BENCINA),new Estanque(50),lalo,ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
//        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

//        System.out.println("Conductor subaru: " + subaru.getConductor());
//        System.out.println("Ruedas Subaru:");
//        for (Rueda r: subaru.getRuedas()){
//            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
//        }

    }
}
