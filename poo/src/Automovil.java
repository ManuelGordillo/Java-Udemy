public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas, TipoAutomovil tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Automovil(){
        this.id = ++ultimoId;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle(){
        String detalle = "Id: " + this.id +
                "\nFabricante: " + this.fabricante +
                "\nModelo: " + this.modelo ;
        if (this.getTipo() != null){
                detalle +="\nTipo: " + this.getTipo().getDescripcion() ;
        }
        detalle += "\nColor: " + this.color;
        if (this.motor != null){
            detalle +=  "\nCilindrada: " + this.motor.getCilindrada();
        }

        detalle +="\nColor Patente: " + colorPatente;
        return detalle;
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " " + this.modelo + " revoluciona a " + rpm + "rpm";
    }

    public String frenar(){
        return "El auto " + this.fabricante + " " + this.modelo + " esta frenando";
    }

    public String acelerarFrenar(int rpm){
        return this.acelerar(rpm) + "\n" +
                this.frenar();
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (estanque.getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (this.getEstanque().getCapacidad()*(porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Automovil)){
            return  false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return id + " " + fabricante + " " + modelo;
    }
}
