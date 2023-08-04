package lab3p2_lloydcooperr;

public class Vehiculo {
    private String numeroPlaca;
    private String marca;
    private String modelo;
    private String tipo;

    public Vehiculo(String numeroPlaca, String marca, String modelo, String tipo) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Vehiculo:" + 
                "numeroPlaca=" + numeroPlaca + 
                ", marca=" + marca + 
                ", modelo=" + modelo + 
                ", tipo=" + tipo;
    }
    
    
}
