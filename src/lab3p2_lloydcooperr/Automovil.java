package lab3p2_lloydcooperr;

public class Automovil extends Vehiculo {
   private String tipoCombustible;
   private int numeroPuertas;
   private String tipoTransmision;
   private int numeroAsientos;

    public Automovil(String tipoCombustible, int numeroPuertas, String tipoTransmision, int numeroAsientos, String numeroPlaca, String marca, String modelo, String tipo) {
        super(numeroPlaca, marca, modelo, tipo);
        this.tipoCombustible = tipoCombustible;
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
        this.numeroAsientos = numeroAsientos;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Automovil:" + 
                "tipoCombustible=" + tipoCombustible + 
                ", numeroPuertas=" + numeroPuertas + 
                ", tipoTransmision=" + tipoTransmision + 
                ", numeroAsientos=" + numeroAsientos;
    }
   
    
   
}
