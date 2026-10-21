public class HolaMundo {
    public static void main(String[] args) {

        int numero = 12;

        boolean valor = true;
        int numero2=5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

//        se usa var de manera dinamica no es necesario indicar el tipo de dato
        var numero3 = 15;

        String nombre;

        nombre = "Manuel";
        if(numero>10){
            nombre ="Juan";
        }

        System.out.println("nombre = " + nombre);

        /*
        * \b Retroceso
        * \n Nueva linea
        * \r retorno del carro
        * \Tabulador
        * \\Diagonal invertida
        * \* comillas dobles
        * */
    }
}
