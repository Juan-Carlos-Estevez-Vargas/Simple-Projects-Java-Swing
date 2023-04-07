package sistemas_numericos;

import java.util.Scanner;

public class Binario extends ComplementoA2 {

    Scanner entrada = new Scanner(System.in);
    int num;

    public static String binarioDecimal(int binario) {

        String cadenabinario = String.valueOf(binario);
        int bin = Integer.parseInt(cadenabinario, 2);
        String decimal = Integer.toString(bin);
        return decimal;

    }

    public static String binOctal(int binario) {

        String cadenaBinario = String.valueOf(binario);
        int bin = Integer.parseInt(cadenaBinario, 2);
        String octal = Integer.toOctalString(bin);
        return octal;

    }

    public static String binHexadecimal(int binario) {

        String cadenaBinario = String.valueOf(binario);
        int bin = Integer.parseInt(cadenaBinario, 2);
        String hexa = Integer.toHexString(bin);
        return hexa;

    }

    public void mostrarBinario() {

        System.out.println("\nDigite un número binario por favor (Base 2) -> ");
        num = entrada.nextInt();
        System.out.println("\nBinario :        -> " + num);
        System.out.println("Decimal :        -> " + binarioDecimal(num));
        System.out.println("Octal :          -> " + binOctal(num));
        System.out.println("Hexadecimal :    -> " + binHexadecimal(num));
        System.out.print("Complemento A2   -> ");
        binComplementoA2(num);

    }
}
