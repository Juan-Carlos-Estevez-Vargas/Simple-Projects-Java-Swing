package sistemas_numericos;

import java.util.Scanner;

public class Octal extends ComplementoA2 {

    Scanner entrada = new Scanner(System.in);
    String num;

    public String octalDecimal(String octal) {

        int dec = Integer.parseInt(octal, 8);
        String decimal = Integer.toString(dec);
        return decimal;

    }

    public String octalHexadecimal(String octal) {

        int hex = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(hex);
        return hexadecimal;

    }

    public String octalBinario(String octal) {

        int bin = Integer.parseInt(octal, 8);
        String binario = Integer.toBinaryString(bin);
        return binario;

    }

    public void mostrarOctal() {

        System.out.println("\nDigite un número octal por favor (Base 8) -> ");
        num = entrada.nextLine();
        System.out.println("\nOctal :         -> " + num);
        System.out.println("Decimal :       -> " + octalDecimal(num));
        System.out.println("Hexadecimal :   -> " + octalHexadecimal(num));
        System.out.println("Binario :       -> " + octalBinario(num));
        System.out.print("Complemento A2  -> ");
        binComplementoA2(Integer.parseInt(octalBinario(num)));

    }
}
