package lab3p2_lloydcooperr;

import java.awt.Color;
import java.util.Date;

public class Vehiculo {
    protected String numeroPlaca;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected Color color;
    protected Date año;

    public Vehiculo(String numeroPlaca, String marca, String modelo, String tipo, Color color, Date año) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.año = año;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + 
                "numeroPlaca=" + numeroPlaca +
                ", marca=" + marca + 
                ", modelo=" + modelo + 
                ", tipo=" + tipo + 
                ", color=" + color + 
                ", año" + año ;
        
    }

    
}
