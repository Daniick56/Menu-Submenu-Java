import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de veces que desea ejecutar el programa: ");
        int cantidadVeces = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        for (int i = 0; i < cantidadVeces; i++) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Saludar");
            System.out.println("2. Pedir nombre de una persona");
            System.out.println("3. Sumar 2 números");
            System.out.print("Ingrese el código de la opción deseada (1, 2 o 3): ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (codigo) {
                case 1:
                    System.out.println("Hola, ¡bienvenido!");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de una persona: ");
                    String nombre = scanner.nextLine();
                    System.out.println("El nombre ingresado es: " + nombre);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    int numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int numero2 = scanner.nextInt();
                    int suma = numero1 + numero2;
                    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
                    scanner.nextLine(); // Consumir el salto de línea después de nextInt()
                    break;
                default:
                    System.out.println("Código inválido. Por favor ingrese 1, 2 o 3.");
                    break;
            }
        }

        scanner.close(); // Cerrar el Scanner al finalizar
        System.out.println("Programa finalizado.");
    }
}