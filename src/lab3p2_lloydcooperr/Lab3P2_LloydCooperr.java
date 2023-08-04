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
            System.out.println("5. Generar boleta");
            System.out.println("6. Salir");
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
                            boolean placaValida = false;
                            String numeroPlaca;

                            do {
                                System.out.println("Ingrese el numero de placa (Formato: HXXX1234 para automóviles y autobuses):");
                                numeroPlaca = read.next();

                                if ((numeroPlaca.length() == 8) &&
                                    ((numeroPlaca.startsWith("H"))) &&
                                    (numeroPlaca.substring(1, 4).matches("[A-Z]+")) &&
                                    (numeroPlaca.substring(4).matches("\\d+"))) {
                                    placaValida = true;

                                    for (Vehiculo vehiculoExistente : vehiculos) {
                                        if (vehiculoExistente.getNumeroPlaca().equals(numeroPlaca)) {
                                            placaValida = false;
                                            System.out.println("Ya existe un vehiculo con esta placa. Intente de nuevo.");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Placa invalida. Asegúrese de que cumpla con el formato requerido.");
                                }
                            } while (!placaValida);

                            System.out.println("Ingrese la marca del vehiculo");
                            read.nextLine();
                            String marca = read.nextLine();
                            read = new Scanner(System.in);
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
                            placaValida = false;
                            
                            do {
                                System.out.println("Ingrese el numero de placa (BXXX1234 para motocicletas):");
                                numeroPlaca = read.next();

                                if ((numeroPlaca.length() == 8) &&
                                    ((numeroPlaca.startsWith("B"))) &&
                                    (numeroPlaca.substring(1, 4).matches("[A-Z]+")) &&
                                    (numeroPlaca.substring(4).matches("\\d+"))) {
                                    placaValida = true;

                                    for (Vehiculo vehiculoExistente : vehiculos) {
                                        if (vehiculoExistente.getNumeroPlaca().equals(numeroPlaca)) {
                                            placaValida = false;
                                            System.out.println("Ya existe un vehiculo con esta placa. Intente de nuevo.");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Placa inválida. Asegúrese de que cumpla con el formato requerido.");
                                }
                            } while (!placaValida);
                            
                            System.out.println("Ingrese la marca del vehiculo");
                            read.nextLine();
                            marca = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el modelo del vehiculo");
                            modelo = read.nextLine();
                            System.out.println("Ingrese el tipo de vehiculo");
                            tipo = read.next();
                            System.out.println("Ingrese el color del vehiculo");
                            color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo (dd/MM/yyyy)");
                            año = new Date(read.next());
                            double velocidadMaxima;
                            do {
                            System.out.println("Ingrese la velocidad máxima de la motocicleta:");
                            velocidadMaxima = read.nextDouble();

                            if (velocidadMaxima <= 0) {
                                System.out.println("La velocidad máxima debe ser mayor que 0. Intente de nuevo.");
                            }
                        } while (velocidadMaxima <= 0);
                            System.out.println("Ingrese el peso de la motocicleta");
                            double pesoMoto = read.nextInt();
                            System.out.println("Ingrese el consumo de combustible de la motocicleta");
                            double consumoCombustible = read.nextDouble();
                            
                            vehiculos.add(new Motocicleta(velocidadMaxima, pesoMoto, consumoCombustible, numeroPlaca, marca, modelo, tipo, color, año));
                            System.out.println("Motocicleta creada correctamente");
                            break;
                        case 3:
                            placaValida = false;
                           
                            do {
                                System.out.println("Ingrese el numero de placa (Formato: HXX1234 para automóviles y autobuses):");
                                numeroPlaca = read.next();

                                if ((numeroPlaca.length() == 7) &&
                                    ((numeroPlaca.startsWith("H"))) &&
                                    (numeroPlaca.substring(1, 4).matches("[A-Z]+")) &&
                                    (numeroPlaca.substring(4).matches("\\d+"))) {
                                    placaValida = true;

                                    for (Vehiculo vehiculoExistente : vehiculos) {
                                        if (vehiculoExistente.getNumeroPlaca().equals(numeroPlaca)) {
                                            placaValida = false;
                                            System.out.println("Ya existe un vehiculo con esta placa. Intente de nuevo.");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Placa inválida. Asegúrese de que cumpla con el formato requerido.");
                                }
                            } while (!placaValida);
                            
                            System.out.println("Ingrese la marca del vehiculo");
                            read.nextLine();
                            marca = read.nextLine();
                            read = new Scanner(System.in);
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
                                System.out.println("0. Salir y modificar");
                                propiedadModificar = read.nextInt();

                                switch (propiedadModificar) {
                                    case 1:
                                        boolean placaValida = false;
                                        String nuevaPlaca;

                                        do {
                                            System.out.println("Ingrese la nueva placa del vehículo (Formato: HXX1234):");
                                            nuevaPlaca = read.next();

                                            if ((nuevaPlaca.length() == 7) &&
                                                ((nuevaPlaca.startsWith("H"))) &&
                                                (nuevaPlaca.substring(1, 3).matches("[A-Z]+")) &&
                                                (nuevaPlaca.substring(4).matches("\\d+"))) {
                                                placaValida = true;
                                            } else {
                                                System.out.println("Placa inválida. Asegúrese de que cumpla con el formato requerido.");
                                            }
                                        } while (!placaValida);

                                        automovil.setNumeroPlaca(nuevaPlaca);
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
                                        break;
                                }

                            } while (propiedadModificar != 0);

                        } else if (vehiculoModificar instanceof Motocicleta) {
                            Motocicleta motocicleta = (Motocicleta) vehiculoModificar;
                            
                            int propiedadModificar = 0;
                            do {
                                System.out.println("Seleccione la propiedad que desea modificar:");
                                System.out.println("1. Placa");
                                System.out.println("2. Marca");
                                System.out.println("3. Modelo");
                                System.out.println("4. Tipo");
                                System.out.println("5. Color");
                                System.out.println("6. Ano");
                                System.out.println("7. Velocidad maxima");
                                System.out.println("8. Peso");
                                System.out.println("9. Consumo de combustible");
                                System.out.println("0. Salir y modificar");
                                propiedadModificar = read.nextInt();

                                switch (propiedadModificar) {
                                    case 1:
                                    boolean placaValida = false;
                                    String nuevaPlaca;

                                    do {
                                        System.out.println("Ingrese la nueva placa del vehículo (Formato: BXX1234):");
                                        nuevaPlaca = read.next();

                                        if ((nuevaPlaca.length() == 7) &&
                                            ((nuevaPlaca.startsWith("B"))) &&
                                            (nuevaPlaca.substring(1, 3).matches("[A-Z]+")) &&
                                            (nuevaPlaca.substring(4).matches("\\d+"))) {
                                            placaValida = true;
                                        } else {
                                            System.out.println("Placa inválida. Asegúrese de que cumpla con el formato requerido.");
                                        }
                                    } while (!placaValida);

                                    motocicleta.setNumeroPlaca(nuevaPlaca);
                                    break;
                                    case 2:
                                        System.out.println("Ingrese la nueva marca del vehículo");
                                        String nuevaMarca = read.next();
                                        motocicleta.setMarca(nuevaMarca);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo modelo del vehículo");
                                        String nuevoModelo = read.next();
                                        motocicleta.setModelo(nuevoModelo);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo tipo del vehículo");
                                        String nuevoTipo = read.next();
                                        motocicleta.setTipo(nuevoTipo);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo color del vehiculo");
                                        Color color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                                        motocicleta.setColor(color);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo año del carro");
                                        Date año = new Date(read.next());
                                        motocicleta.setAño(año);
                                        break;
                                    case 7:
                                        double nuevaVelocidadMaxima;
                                        do {
                                            System.out.println("Ingrese la nueva velocidad maxima de la motocicleta:");
                                            nuevaVelocidadMaxima = read.nextDouble();

                                            if (nuevaVelocidadMaxima <= 0) {
                                                System.out.println("La velocidad maxima debe ser mayor que 0. Intente de nuevo.");
                                            }
                                        } while (nuevaVelocidadMaxima <= 0);

                                        motocicleta.setVelocidadMaxima(nuevaVelocidadMaxima);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese el peso de la motocicleta");
                                        double pesoMoto = read.nextInt();
                                        motocicleta.setPeso(pesoMoto);
                                        break;
                                    case 9:
                                        System.out.println("Ingrese el consumo de combustible de la motocicleta");
                                        double consumoCombustible = read.nextDouble();
                                        motocicleta.setConsumoCombustible(consumoCombustible);
                                        break;
                                    default:
                                        break;
                                }           
                            } while (propiedadModificar != 0);

                        } else if (vehiculoModificar instanceof Autobus) {
                            Autobus autobus = (Autobus) vehiculoModificar;
                            
                            int propiedadModificar = 0;
                            do {
                                System.out.println("Seleccione la propiedad que desea modificar:");
                                System.out.println("1. Placa");
                                System.out.println("2. Marca");
                                System.out.println("3. Modelo");
                                System.out.println("4. Tipo");
                                System.out.println("5. Color");
                                System.out.println("6. Año");
                                System.out.println("7. Capacidad de pasajeros");
                                System.out.println("8. Numero de ejes");
                                System.out.println("9. Longitud");
                                System.out.println("0. Salir y modificar");
                                propiedadModificar = read.nextInt();

                                switch (propiedadModificar) {
                                    case 1:
                                        boolean placaValida = false;
                                        String nuevaPlaca;

                                        do {
                                            System.out.println("Ingrese la nueva placa del vehículo (Formato: HXX1234):");
                                            nuevaPlaca = read.next();

                                            if ((nuevaPlaca.length() == 7) &&
                                                ((nuevaPlaca.startsWith("H"))) &&
                                                (nuevaPlaca.substring(1, 3).matches("[A-Z]+")) &&
                                                (nuevaPlaca.substring(4).matches("\\d+"))) {
                                                placaValida = true;
                                            } else {
                                                System.out.println("Placa inválida. Asegúrese de que cumpla con el formato requerido.");
                                            }
                                        } while (!placaValida);

                                        autobus.setNumeroPlaca(nuevaPlaca);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva marca del vehículo");
                                        String nuevaMarca = read.next();
                                        autobus.setMarca(nuevaMarca);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo modelo del vehículo");
                                        String nuevoModelo = read.next();
                                        autobus.setModelo(nuevoModelo);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo tipo del vehículo");
                                        String nuevoTipo = read.next();
                                        autobus.setTipo(nuevoTipo);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo color del vehiculo");
                                        Color color = JColorChooser.showDialog(null, "Elija color:", Color.yellow);
                                        autobus.setColor(color);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo año del carro");
                                        Date año = new Date(read.next());
                                        autobus.setAño(año);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese la velocidad maxima de la motocicleta");
                                        int capacidadPasajeros = read.nextInt();
                                        autobus.setCapacidadPasajeros(capacidadPasajeros);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese el peso de la motocicleta");
                                        int numeroEjes = read.nextInt();
                                        autobus.setNumeroEjes(numeroEjes);
                                        break;
                                    case 9:
                                        System.out.println("Ingrese el consumo de combustible de la motocicleta");
                                        double longitud = read.nextDouble();
                                        autobus.setLongitud(longitud);
                                        break;
                                    default:
                                        break;
                                }
                            } while (propiedadModificar != 0);
                        }
                        vehiculos.set(vehiculoIndex, vehiculoModificar);
                        System.out.println("Vehículo modificado correctamente");
                    } else {
                        System.out.println("Vehículo no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Seleccione el vehiculo que desea eliminar:");

                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println((i + 1) + ". " + vehiculos.get(i).toString());
                    }

                    int seleccionEliminar = read.nextInt();

                    if (seleccionEliminar >= 1 && seleccionEliminar <= vehiculos.size()) {
                        Vehiculo vehiculoEliminar = vehiculos.get(seleccionEliminar - 1);

                        System.out.println("Esta seguro de que desea eliminar el siguiente vehículo?");
                        System.out.println(vehiculoEliminar.toString()); 
                        System.out.println("1. Sí");
                        System.out.println("2. No");

                        int confirmacion = read.nextInt();

                        if (confirmacion == 1) {
                            vehiculos.remove(seleccionEliminar - 1);
                            System.out.println("Vehiculo eliminado correctamente");
                        } else {
                            System.out.println("Operacion cancelada");
                        }
                    } else {
                        System.out.println("Seleccion no valida");
                    }
                    break;
                case 4:
                    System.out.println("Vehiculos registrados:");

                    int totalAutomoviles = 0;
                    int totalMotocicletas = 0;
                    int totalAutobuses = 0;

                    System.out.println("Automoviles:");
                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo instanceof Automovil) {
                            System.out.println(vehiculo.toString()); 
                            totalAutomoviles++;
                        }
                    }

                    System.out.println("Motocicletas:");
                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo instanceof Motocicleta) {
                            System.out.println(vehiculo.toString()); 
                            totalMotocicletas++;
                        }
                    }

                    System.out.println("Autobuses:");
                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo instanceof Autobus) {
                            System.out.println(vehiculo.toString()); 
                            totalAutobuses++;
                        }
                    }

                    System.out.println("Total de Automoviles: " + totalAutomoviles);
                    System.out.println("Total de Motocicletas: " + totalMotocicletas);
                    System.out.println("Total de Autobuses: " + totalAutobuses);
                    break;
                case 5:
                    System.out.println("Seleccione el vehículo para generar la Boleta de Revisión Vehicular:");

                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println((i + 1) + ". " + vehiculos.get(i).toString()); 
                    }

                    int seleccion = read.nextInt();

                    if (seleccion >= 1 && seleccion <= vehiculos.size()) {
                        Vehiculo vehiculoSeleccionado = vehiculos.get(seleccion - 1);
                        double totalTasa = 275 + 250; 

                        if (vehiculoSeleccionado instanceof Automovil) {
                            totalTasa += 1200;
                        } else if (vehiculoSeleccionado instanceof Motocicleta) {
                            totalTasa += 200;
                        } else if (vehiculoSeleccionado instanceof Autobus) {
                            totalTasa += 1000;
                        }

                        System.out.println("Boleta de revision vehicular");
                        System.out.println("Datos del vehículo:");
                        System.out.println(vehiculoSeleccionado.toString()); // Asumiendo que has implementado el método toString en la clase Vehiculo
                        System.out.println("Total a Pagar de la tasa vehicular: Lps." + totalTasa);
                    } else {
                        System.out.println("Seleccion no valida");
                    }
                    break;
            }
        }while (opcion != 6);
    }
}
