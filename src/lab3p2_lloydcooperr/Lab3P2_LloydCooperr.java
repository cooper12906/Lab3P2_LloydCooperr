package lab3p2_lloydcooperr;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_LloydCooperr {
    
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        int option = 0;
        int op = 0;
        int op1 = 0;
        int op2 = 0;
        
        do{
            System.out.println("--------MENU--------");
            System.out.println("1. Crear vehiculo");
            System.out.println("2. Modificar vehiculo");
            System.out.println("3. Eliminar vehiculo");
            System.out.println("4. Listar vehiculo");
            System.out.println("5. Salir");
            System.out.println("--------------------");
            opcion = read.nextInt();
            read = new Scanner(System.in);
            
            switch(opcion){
                case 1:
                    System.out.println("Que desea crear?");
                    System.out.println("1. Automovil");
                    System.out.println("2. Motocicleta");
                    System.out.println("3. Autobus");
                    option = read.nextInt();
                    
                    switch(option){
                        case 1:
                            System.out.println("Ingrese el numero de placa");
                            String numeroPlaca = read.nextLine();
                            System.out.println("Ingrese la marca del vehiculo");
                            String marca = read.nextLine();
                            System.out.println("Ingrese el modelo del vehiculo");
                            String modelo = read.nextLine();
                            System.out.println("Ingrese el tipo de vehiculo");
                            String tipo = read.nextLine();
                            System.out.println("Ingrese el color del vehiculo");
                            Color color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo (dd/MM/yyyy)");
                            Date año = new Date(read.next());
                            System.out.println("Ingrese el tipo de combustible");
                            String tipoCombustible = read.nextLine();
                            System.out.println("Ingrese el numero de puertas");
                            int numeroPuertas = read.nextInt();
                            System.out.println("Ingrese el tipo de transmision");
                            String tipoTransmision = read.nextLine();
                            System.out.println("Ingrese el numero de asientos");
                            int numeroAsientos = read.nextInt();
                            
                            
                            vehiculos.add(new Automovil(tipoCombustible, numeroPuertas, tipoTransmision, numeroAsientos, numeroPlaca, marca, modelo, tipo, color, año));
                            System.out.println("Automovil creado correctamente");
                            break;
                        case 2:
                        
                        break;

                        case 3:
                            
                            break;

                        case 4:
                       
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que desea modificar?");
                    System.out.println("1. Automovil");
                    System.out.println("2. Motocicleta");
                    System.out.println("3. Autobus");
                    op1 = read.nextInt();
                    
                    switch(op1){
                        case 1:
                            break;
                        case 2:
                        
                            break;
                        case 3:
                            break;
                        case 4:
                            
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Que desea eliminar?");
                    System.out.println("1. Automovil");
                    System.out.println("2. Motocicleta");
                    System.out.println("3. Autobus");
                    op2 = read.nextInt();
                    
                    switch (op2){
                        case 1:
                            
                            break;
                        case 2:
                           
                            break;
                        case 3:
                            
                            break;
                        case 4:
                        
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 4:
                    
                    break;
            }
        }while (opcion != 5);
    }
}
