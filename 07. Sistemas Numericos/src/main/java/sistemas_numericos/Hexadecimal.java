package sistemas_numericos;

import java.util.Scanner;

public class Hexadecimal extends ComplementoA2 {

    Scanner entrada = new Scanner(System.in);
    String num;

    public static String hexadecimalDecimal(String hexadecimal) {

        int dec = Integer.parseInt(hexadecimal, 16);
        String decimal = Integer.toString(dec);
        return decimal;

    }

    public static String hexadecimalOctal(String hexadecimal) {

        int oct = Integer.parseInt(hexadecimal, 16);
        String octal = Integer.toOctalString(oct);
        return octal;

    }

    public static String hexadecimalBinario(String hexadecimal) {

        int bin = Integer.parseInt(hexadecimal, 16);
        String binary = Integer.toBinaryString(bin);
        return binary;

    }

    public void mostrarHexadecimal() {

        System.out.println("\nDigite un número hexadecimal por favor (Base 16) -> ");
        num = entrada.nextLine();
        System.out.println("\nHexadecimal :    -> " + num);
        System.out.println("Decimal :        -> " + hexadecimalDecimal(num));
        System.out.println("Octal :          -> " + hexadecimalOctal(num));
        System.out.println("Binario :        -> " + hexadecimalBinario(num));
        System.out.print("Complemento A2 : -> ");
        binComplementoA2(Integer.parseInt(hexadecimalBinario(num)));

    }
}
