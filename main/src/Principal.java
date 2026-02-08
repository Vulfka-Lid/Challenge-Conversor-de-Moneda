import java.util.Scanner;

public class Principal {

    static void main(String[] args) {

        String Nombre = "Nicolas";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


        Scanner teclado = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("\nNombre del cliente: " + Nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: $" + saldo);
        System.out.println("*********************************************");

        String menu = """
                ************************************************************
                
                            Bienvenido/a al conversor de moneda 
                1 - Dólar =>> Peso chileno
                2 - Peso chileno =>> Dólar
                3 - Depositar
                9 - Salir
                
                ************************************************************
                """;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto al cual desea convertir");
                    Conversion convertir = new Conversion();
                    double monto = teclado.nextDouble();
                    String tipoMoneda = "USD";
                    System.out.println(Moneda.class);
                    break;

                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();

                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios.");
                    break;

                default:
                    System.out.println("Opción no válida");

            }
        }
    }
}







