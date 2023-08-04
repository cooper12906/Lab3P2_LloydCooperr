package lab3p2_lloydcooperr;

import java.awt.Color;
import java.util.Date;

public class Motocicleta extends Vehiculo {
    private double velocidadMaxima;
    private double peso;
    private double consumoCombustible;

    public Motocicleta(double velocidadMaxima, double peso, double consumoCombustible, String numeroPlaca, String marca, String modelo, String tipo, Color color, Date año) {
        super(numeroPlaca, marca, modelo, tipo, color, año);
        this.velocidadMaxima = velocidadMaxima;
        this.peso = peso;
        this.consumoCombustible = consumoCombustible;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + 
                "velocidadMaxima=" + velocidadMaxima + 
                ", peso=" + peso + 
                ", consumoCombustible=" + consumoCombustible;
    }
    
    
}
