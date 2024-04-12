import java.util.Scanner;

public class Banco {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        

        int optiones = 0;
        String usuario = "Carlito";
        double monto = 12500.99;
        double monto2;

        String menu = """
                Bienvenido a Paqueticos MoteteRD 5G

                Escriba un numero de la opcion deseada
                1 - Comprar un MoteteRD 5G
                2 - Retirar saldo
                3 - Depositar
                9 - Salir
                """;

        String MoteteRD = """
                Internet MoteteRD 5G Plus
                1 - 1Dia 1GB $125
                2 - 3Dias 3GB $250
                3 - 5Dias 5GB $500
                9 - Salir
                """;

        while (optiones != 9) {
            System.out.println(menu);
            int optiones1 = consola.nextInt();

            switch (optiones1) {
                case 1:
                    System.out.println(MoteteRD);
                    int comprar = consola.nextInt();

                    switch (comprar) {
                        case 1:
                            System.out.println("saldo anterior " + monto);
                            monto -= 125;
                            System.out.println("saldo actual " + monto);
                            System.out.println("sea comprado exitosamentu su Internet de 1 dia");

                            break;
                        case 2:
                            System.out.println("saldo anterior " + monto);
                            monto -= 250;
                            System.out.println("saldo actual " + monto);
                            System.out.println("sea comprado exitosamentu su Internet de 3 dias");

                            break;
                        case 3:
                            System.out.println("saldo anterior " + monto);
                            monto -= 500;
                            System.out.println("saldo actual " + monto);
                            System.out.println("sea comprado exitosamentu su Internet de 5 dias");

                            break;
                        case 9:
                            System.out.println();

                            break;
                        default:                    
                            break;
                    }

                    break;
                case 2:
                    System.out.println("""
                            cliente: %s
                            Saldo: %.2f
                            """.formatted(usuario, monto));
                    System.out.println("que cantidad le gustaria a usted retirar?");
                    monto2 = consola.nextDouble();

                        if (monto2 > monto){
                            System.out.println("""
                                    No tienes saldo suficiente para realizar esta opcion
                                    """);
                        } else {                          
                            System.out.println("Se completo correctamente su retiro de: $" + monto2);
                            monto -= monto2;
                            System.out.println("Su saldo actual es de: $" + monto + "\n");
                        }

                    break;
                case 3:
                    System.out.println("""
                            Cliente: %s
                            Suelto: %.2f
                            """.formatted(usuario, monto));
                    System.out.println("Introdusca valor que le gustaria depositar");
                    monto2 = consola.nextDouble();
                    System.out.println("Se completo correctamente el deposito: $" + monto2);
                    monto += monto2;
                    System.out.println("su sueldo actual es de: $" + monto + "\n");

                    break;
                case 9:
                    System.out.println("Saliste correctamente, gracias por utilizar nuestro servicio MoteteRD 5G");
                    
                    break;
                default:
                    break;

            }
        }
    }
}
