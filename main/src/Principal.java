import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { // Agregado 'public'
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Conversion conversor = new Conversion();

        while (opcion != 9) {
            System.out.println("""
                ************************************************************
                Bienvenido/a al conversor de moneda
                1 - Dólar =>> Peso chileno
                2 - Peso chileno =>> Dólar
                3 - Otra conversión
                9 - Salir
                ************************************************************
                """);

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
                    System.out.println("************************************************************");
                    System.out.println("Resultado: " + montoClp + " CLP son " + res2.conversion_result() + " USD");
                    System.out.println("************************************************************\n");
                    break;

                case 3:
                    System.out.println("Ingrese las siglas de la moneda de origen (ej: USD, ARS, BRL):");
                    String monedaBase = teclado.next().toUpperCase(); // Cambiado de nextString a next

                    System.out.println("Ingrese las siglas de la moneda de destino (ej: CLP, EUR, MXN):");
                    String monedaDestino = teclado.next().toUpperCase();

                    System.out.println("Ingrese el monto que desea convertir:");
                    double monto = teclado.nextDouble();

                    // Invocamos el método con las variables que el usuario escribió
                    Moneda res3 = conversor.convertirMoneda(monedaBase, monedaDestino, monto);

                    System.out.println("************************************************************");
                    System.out.println("Resultado: " + monto + " " + monedaBase + " son: "
                            + res3.conversion_result() + " " + monedaDestino);
                    System.out.println("Tasa de cambio aplicada: " + res3.conversion_rate());
                    System.out.println("************************************************************\n");
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





