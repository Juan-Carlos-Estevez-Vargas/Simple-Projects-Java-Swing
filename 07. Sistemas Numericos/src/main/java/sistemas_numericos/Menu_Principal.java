package sistemas_numericos;

import java.util.Scanner;

public class Menu_Principal {

    public void menu() {

        Scanner entrada = new Scanner(System.in);

        //Instancias de las clases
        Decimal decimal = new Decimal();
        Menu_Principal menu = new Menu_Principal();
        Binario binario = new Binario();
        Octal octal = new Octal();
        Hexadecimal hexadecimal = new Hexadecimal();

        try {
            int opc;
            System.out.println("\n\n---------------------------------------\n"
                    + "-    ¿Qué tipo de conversión desea?   -\n");

            System.out.println("---------------------------------------\n"
                    + "-          SISTEMAS NUMÉRICOS         -\n"
                    + "---------------------------------------\n"
                    + "-    1. Decimal                       -\n"
                    + "-    2. Binario                       -\n"
                    + "-    3. Octal                         -\n"
                    + "-    4. Hexadecimal                   -\n"
                    + "-    5. Salir                         -\n"
                    + "---------------------------------------");
            System.out.println("-   Digite su opciòn                  -\n"
                    + "---------------------------------------");

            opc = entrada.nextInt();

            switch (opc) {
                case 1 -> {
                    decimal.decimal();
                    menu.menu();
                    break;
                }
                case 2 -> {
                    binario.mostrarBinario();
                    menu.menu();
                    break;
                }
                case 3 -> {
                    octal.mostrarOctal();
                    menu.menu();
                    break;
                }
                case 4 -> {
                    hexadecimal.mostrarHexadecimal();
                    menu.menu();
                }
                case 5 -> {
                    System.out.println("\n     Sesión concluida con éxito      ");
                    break;
                }
                default -> {
                    System.out.println("¡¡Debe seleccionar una opción correcta!!");
                    menu.menu();
                }
            }
        } catch (Exception e) {
            System.out.println("Debe ingresar un valor numérico");
            menu.menu();
        }
    }

}
