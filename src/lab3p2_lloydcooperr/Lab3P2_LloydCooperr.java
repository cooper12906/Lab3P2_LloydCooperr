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
                            String numeroPlaca = read.next();
                            System.out.println("Ingrese la marca del vehiculo");
                            String marca = read.nextLine();
                            read.nextLine();
                            System.out.println("Ingrese el modelo del vehiculo");
                            String modelo = read.nextLine();
                            System.out.println("Ingrese el tipo de vehiculo");
                            String tipo = read.next();
                            System.out.println("Ingrese el color del vehiculo");
                            Color color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo (dd/MM/yyyy)");
                            Date año = new Date(read.next());
                            System.out.println("Ingrese el tipo de combustible");
                            String tipoCombustible = read.next();
                            System.out.println("Ingrese el numero de puertas");
                            int numeroPuertas = read.nextInt();
                            System.out.println("Ingrese el tipo de transmision");
                            String tipoTransmision = read.next();
                            System.out.println("Ingrese el numero de asientos");
                            int numeroAsientos = read.nextInt();
                            
                            
                            vehiculos.add(new Automovil(tipoCombustible, numeroPuertas, tipoTransmision, numeroAsientos, numeroPlaca, marca, modelo, tipo, color, año));
                            System.out.println("Automovil creado correctamente");
                            break;
                        case 2:
                            System.out.println("Ingrese el numero de placa");
                            numeroPlaca = read.next();
                            System.out.println("Ingrese la marca del vehiculo");
                            marca = read.nextLine();
                            System.out.println("Ingrese el modelo del vehiculo");
                            modelo = read.nextLine();
                            System.out.println("Ingrese el tipo de vehiculo");
                            tipo = read.next();
                            System.out.println("Ingrese el color del vehiculo");
                            color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo (dd/MM/yyyy)");
                            año = new Date(read.next());
                            System.out.println("Ingrese la velocidad maxima de la motocicleta");
                            double velocidadMaxima = read.nextDouble();
                            System.out.println("Ingrese el peso de la motocicleta");
                            double pesoMoto = read.nextInt();
                            System.out.println("Ingrese el consumo de combustible de la motocicleta");
                            double consumoCombustible = read.nextDouble();
                            
                            vehiculos.add(new Motocicleta(velocidadMaxima, pesoMoto, consumoCombustible, numeroPlaca, marca, modelo, tipo, color, año));
                            System.out.println("Motocicleta creada correctamente");
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de placa");
                            numeroPlaca = read.next();
                            System.out.println("Ingrese la marca del vehiculo");
                            marca = read.nextLine();
                            System.out.println("Ingrese el modelo del vehiculo");
                            modelo = read.nextLine();
                            System.out.println("Ingrese el tipo de vehiculo");
                            tipo = read.next();
                            System.out.println("Ingrese el color del vehiculo");
                            color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo (dd/MM/yyyy)");
                            año = new Date(read.next());
                            System.out.println("Ingrese la capacidad de pasajeros del autobus");
                            int cantidadPasajeros = read.nextInt();
                            System.out.println("Ingrese el numero de ejes del autobus");
                            int numeroEjes = read.nextInt();
                            System.out.println("Ingrese la longitud del autobus");
                            double longitud = read.nextDouble();
                            
                            vehiculos.add(new Autobus(cantidadPasajeros, numeroEjes, longitud, numeroPlaca, marca, modelo, tipo, color, año));
                            System.out.println("Autobus agregado correctamente");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el número de placa del vehículo que desea modificar:");
                    String placaModificar = read.next();
                    int vehiculoIndex = -1;

                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i).getNumeroPlaca().equals(placaModificar)) {
                            vehiculoIndex = i;
                            break;
                        }
                    }

                    if (vehiculoIndex != -1) {
                        Vehiculo vehiculoModificar = vehiculos.get(vehiculoIndex);

                        if (vehiculoModificar instanceof Automovil) {
                            Automovil automovil = (Automovil) vehiculoModificar;

                            int propiedadModificar = 0;
                            do {
                                System.out.println("Seleccione la propiedad que desea modificar:");
                                System.out.println("1. Placa");
                                System.out.println("2. Marca");
                                System.out.println("3. Modelo");
                                System.out.println("4. Tipo");
                                System.out.println("5. Color");
                                System.out.println("6. Ano");
                                System.out.println("7. Tipo combustible");
                                System.out.println("8. Numero de puertas");
                                System.out.println("9. Tipo de transmision");
                                System.out.println("10. Numero de asientos");
                                propiedadModificar = read.nextInt();

                                switch (propiedadModificar) {
                                    case 1:
                                        System.out.println("Ingrese la nueva placa del vehiculo");
                                        String numeroPlaca = read.next();
                                        automovil.setNumeroPlaca(numeroPlaca);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva marca del vehículo");
                                        String nuevaMarca = read.next();
                                        automovil.setMarca(nuevaMarca);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo modelo del vehículo");
                                        String nuevoModelo = read.next();
                                        automovil.setModelo(nuevoModelo);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo tipo del vehículo");
                                        String nuevoTipo = read.next();
                                        automovil.setTipo(nuevoTipo);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo color del vehiculo");
                                        Color color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                                        automovil.setColor(color);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo ano del carro");
                                        Date año = new Date(read.next());
                                        automovil.setAño(año);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese el nuevo tipo de combustible");
                                        String tipoCombustible = read.next();
                                        automovil.setTipoCombustible(tipoCombustible);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese el nuevo numero de puertas");
                                        int numeroPuertas = read.nextInt();
                                        automovil.setNumeroPuertas(numeroPuertas);
                                        break;
                                    case 9:
                                        System.out.println("Ingrese el nuevo tipo de transmision");
                                        String tipoTransmision = read.next();
                                        automovil.setTipoTransmision(tipoTransmision);
                                        break;
                                    case 10:
                                        System.out.println("Ingrese el nuevo numero de asientos");
                                        int numeroAsientos = read.nextInt();
                                        automovil.setNumeroAsientos(numeroAsientos);
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                        break;
                                }

                            } while (propiedadModificar != 0);

                        } else if (vehiculoModificar instanceof Motocicleta) {
                            Motocicleta motocicleta = (Motocicleta) vehiculoModificar;
                            
                            

                        } else if (vehiculoModificar instanceof Autobus) {
                            // Código similar para la modificación de un autobús

                        }

                        vehiculos.set(vehiculoIndex, vehiculoModificar);
                        System.out.println("Vehículo modificado correctamente");
                    } else {
                        System.out.println("Vehículo no encontrado");
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
