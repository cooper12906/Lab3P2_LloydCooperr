package lab3p2_lloydcooperr;

import java.awt.Color;
import java.util.Date;

public class Autobus extends Vehiculo {
    private int capacidadPasajeros;
    private int numeroEjes;
    private double longitud;

    public Autobus(int capacidadPasajeros, int numeroEjes, double longitud, String numeroPlaca, String marca, String modelo, String tipo, Color color, Date año) {
        super(numeroPlaca, marca, modelo, tipo, color, año);
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroEjes = numeroEjes;
        this.longitud = longitud;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Autobus{" + 
                "capacidadPasajeros=" + capacidadPasajeros + 
                ", numeroEjes=" + numeroEjes + 
                ", longitud=" + longitud;
    }
    
    
}
