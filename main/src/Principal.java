import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { // Agregado 'public'
        String nombre = "Nicolas";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Conversion conversor = new Conversion();

        while (opcion != 9) {
            System.out.println("""
                ************************************************************
                Bienvenido/a %s al conversor de moneda
                1 - Dólar =>> Peso chileno
                2 - Peso chileno =>> Dólar
                3 - Consultar Saldo
                9 - Salir
                ************************************************************
                """.formatted(nombre));

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto en USD:");
                    double montoUsd = teclado.nextDouble();
                    // Llamamos a la lógica de conversión
                    Moneda res1 = conversor.convertirMoneda("USD", "CLP", montoUsd);
                    System.out.println("Resultado: " + montoUsd + " USD son " + res1.conversion_result() + " CLP");
                    break;

                case 2:
                    System.out.println("Ingrese el monto en CLP:");
                    double montoClp = teclado.nextDouble();
                    Moneda res2 = conversor.convertirMoneda("CLP", "USD", montoClp);
                    System.out.println("Resultado: " + montoClp + " CLP son " + res2.conversion_result() + " USD");
                    break;

                case 3:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}





