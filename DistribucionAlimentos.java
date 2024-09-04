import java.util.Scanner;

public class DistribucionAlimentos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine(); // Leer y almacenar el nombre del usuario

        // Solicitar la marca del vehículo al usuario
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine(); // Leer y almacenar la marca

        // Solicitar el modelo del vehículo al usuario
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine(); // Leer y almacenar el modelo

        // Solicitar la cilindrada del vehículo al usuario
        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = scanner.nextLine(); // Leer y almacenar la cilindrada

        // Solicitar el tipo de combustible del vehículo al usuario
        System.out.print("Ingrese el tipo de combustible: ");
        String tipoCombustible = scanner.nextLine(); // Leer y almacenar el tipo de combustible

        // Solicitar la capacidad en pasajeros del vehículo al usuario
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidadPasajeros;
        try {
            capacidadPasajeros = scanner.nextInt(); // Leer y almacenar la capacidad en pasajeros
            if (capacidadPasajeros <= 0) {
                System.out.println("La capacidad en pasajeros debe ser un número positivo.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida para la capacidad en pasajeros.");
            return;
        }

        // Mostrar los datos ingresados
        System.out.println("\nNombre del usuario: " + nombreUsuario);
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
        
        // Cerrar el Scanner
        scanner.close();
    }
}
