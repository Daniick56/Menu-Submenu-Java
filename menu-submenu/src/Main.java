import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pidiendo el nombre al usuario:
        System.out.println("Ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        //Saludando al usuario por su nombre:
        System.out.println("Hola " + nombreUsuario + ", bienvenido a nuestro menu!!!\n");

        //declaracion e inicalizacion de variables a utilizar
        int codMenuPpal = 0;
        int codMenuTipico = 0;
        int codMenuMarinero = 0;
        int codMenuBebidas = 0;
            //contadores:
        int contadorTipico = 0;
        int contadorMarinero = 0;
        int contadorBebida = 0;
            //variable que almacena el total a pagar
        int sumaTotal = 0;

        try {
            do {
                // Menú principal del restaurante
                String menu = "MENU RESTAURANTE: \n\n";
                menu += "1. Plato tipico.\n";
                menu += "2. Plato marinero.\n";
                menu += "3. Bebidas.\n";
                menu += "4. Salir.\n";
                menu += "Por favor selecciona una opcion.";

                System.out.println(menu);
                codMenuPpal = Integer.parseInt(scanner.next()); // Capturamos la selección del usuario

                switch (codMenuPpal) {
                    case 1:
                        do {
                            // Menú de platos típicos
                            String menuTipico = "MENU TIPICO\n\n";
                            menuTipico += "1. Frijoles.\n";
                            menuTipico += "2. Sopa de verduras.\n";
                            menuTipico += "3. Regresar.\n";
                            menuTipico += "Por favor seleccione una opcion.\n";

                            System.out.println(menuTipico);
                            codMenuTipico = Integer.parseInt(scanner.next()); // Capturamos la selección del usuario

                            switch (codMenuTipico) {
                                case 1:
                                    System.out.println("Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                    contadorTipico++; // Incrementamos el contador de platos típicos
                                    sumaTotal+= 12000; // Sumamos lo que cuesta el item
                                    break;
                                case 2:
                                    System.out.println("Se ha solicitado una sopa de verduras, el costo es de $" + 8000);
                                    contadorTipico++; // Incrementamos el contador de platos típicos
                                    sumaTotal+= 8000; // Sumamos lo que cuesta el item
                                    break;
                                case 3:
                                    // Salir del menú típico y volver al menú principal
                                    break;
                                default:
                                    System.out.println("No corresponde a un codigo valido.");
                                    break;
                            }

                            codMenuTipico = 3; // Si no desea repetir, asignamos 3 para salir del bucle

                        } while (codMenuTipico != 3);

                        break;
                    case 2:
                        do {
                            // Menú de platos marineros
                            String menuMarinero = "MENU MARINERO\n\n";
                            menuMarinero += "1. Pescado.\n";
                            menuMarinero += "2. Paella.\n";
                            menuMarinero += "3. Regresar.\n";
                            menuMarinero += "Por favor seleccione una opcion.\n";

                            System.out.println(menuMarinero);
                            codMenuMarinero = Integer.parseInt(scanner.next()); // Capturamos la selección del usuario

                            switch (codMenuMarinero) {
                                case 1:
                                    System.out.println("Se ha solicitado un plato de Pescado, el costo es de $" + 10000);
                                    contadorMarinero++; // Incrementamos el contador de platos marineros
                                    sumaTotal+= 10000; // Sumamos lo que cuesta el item
                                    break;
                                case 2:
                                    System.out.println("Se ha solicitado un plato de Paella, el costo es de $" + 14000);
                                    contadorMarinero++; // Incrementamos el contador de platos marineros
                                    sumaTotal+= 14000; // Sumamos lo que cuesta el item
                                    break;
                                case 3:
                                    // Salir del menú marinero y volver al menú principal
                                    break;
                                default:
                                    System.out.println("No corresponde a un codigo valido.");
                                    break;
                            }

                            codMenuMarinero = 3; // Si no desea repetir, asignamos 3 para salir del bucle
                        } while (codMenuMarinero != 3);

                        break;
                    case 3:
                        do {
                            // Menú de bebidas
                            String menuBebidas = "BEBIDAS\n\n";
                            menuBebidas += "1. Coca Cola.\n";
                            menuBebidas += "2. Jugo de Lulo.\n";
                            menuBebidas += "3. Regresar.\n";
                            menuBebidas += "Por favor seleccione una opcion.\n";

                            System.out.println(menuBebidas);
                            codMenuBebidas = Integer.parseInt(scanner.next()); // Capturamos la selección del usuario

                            switch (codMenuBebidas) {
                                case 1:
                                    System.out.println("Se ha solicitado un vaso de Coca Cola, el costo es de $" + 3000);
                                    contadorBebida++; // Incrementamos el contador de bebidas
                                    sumaTotal+= 3000; // Sumamos lo que cuesta el item
                                    break;
                                case 2:
                                    System.out.println("Se ha solicitado un vaso de Jugo de Lulo, el costo es de $" + 4000);
                                    contadorBebida++; // Incrementamos el contador de bebidas
                                    sumaTotal+= 4000; // Sumamos lo que cuesta el item
                                    break;
                                case 3:
                                    // Salir del menú de bebidas y volver al menú principal
                                    break;
                                default:
                                    System.out.println("No corresponde a un codigo valido.");
                                    break;
                            }

                            codMenuBebidas = 3; // Si no desea repetir, asignamos 3 para salir del bucle
                        } while (codMenuBebidas != 3);

                        break;
                    case 4:
                        // Salir del programa al seleccionar la opción "Salir"
                        break;
                    default:
                        System.out.println("No corresponde a un codigo valido.");
                        break;
                }
                if (codMenuPpal == 4){
                    //CREAMOS EL MENSAJE DE FACTURACION:
                    System.out.println("\n\nFACTURA:                " + nombreUsuario + "\n");
                    // Mostramos la cantidad de items encargados por cada categoría
                    System.out.println("La cantidad de items encargados de platos tipicos son: " + contadorTipico);
                    System.out.println("La cantidad de items encargados de platos marineros son: " + contadorMarinero);
                    System.out.println("La cantidad de items encargados de bebida son: " + contadorBebida);
                    // Mostramos el total a pagar:
                    System.out.println("\nEl total a pagar es: $" + sumaTotal);
                }

            } while (codMenuPpal != 4); // El bucle continuará mientras no se seleccione la opción "Salir"
        }
        catch (NumberFormatException e) {
            System.out.println("Ingresa un valor numérico");
        }
    }
}
