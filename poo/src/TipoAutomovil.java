public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano",4),
    STATION_WAGON("Station Wagon","Auto Grande", 5),
    HATCHBACK("Hatchback", "Auto Compacto", 5),
    PICKUP("Pickup", "Camioneta",4),
    COUPE("Coupé","Auto Pequeño",2),
    CONVERTIBLE("Convertible", "Auto Deportivo",2),
    FURGON("Furgón", "Auto Utilitario",4);

    private final String nombre;
    private final int numPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
