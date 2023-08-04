package lab3p2_lloydcooperr;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculo {
   private String tipoCombustible;
   private int numeroPuertas;
   private String tipoTransmision;
   private int numeroAsientos;

    public Automovil(String tipoCombustible, int numeroPuertas, String tipoTransmision, int numeroAsientos, String numeroPlaca, String marca, String modelo, String tipo, Color color, Date año) {
        super(numeroPlaca, marca, modelo, tipo, color, año);
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
        return "Automovil:\n" +
               "Número de placa: " + getNumeroPlaca() + "\n" +
               "Marca: " + getMarca() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Tipo: " + getTipo() + "\n" +
               "Color: " + getColor().toString() + "\n" +
               "Año: " + getAño().toString() + "\n" +
               "Tipo de combustible: " + tipoCombustible + "\n" +
               "Número de puertas: " + numeroPuertas + "\n" +
               "Tipo de transmisión: " + tipoTransmision + "\n" +
               "Número de asientos: " + numeroAsientos;
    }
}
