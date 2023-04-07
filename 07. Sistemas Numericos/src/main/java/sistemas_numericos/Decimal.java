package sistemas_numericos;

import java.util.Scanner;

public class Decimal extends ComplementoA2 {

    Scanner entrada = new Scanner(System.in);
    int num;

    public void decimal() {

        System.out.println("\nDigite un número decimal por favor (Base 10) -> ");
        num = entrada.nextInt();
        System.out.println("\n\nDecimal :        -> " + num);
        System.out.println("Binario :        -> " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal :    -> " + Integer.toHexString(num));
        System.out.println("Octal :          -> " + Integer.toOctalString(num));
        System.out.print("Complemento A2 : -> ");
        binComplementoA2(Integer.parseInt(Integer.toBinaryString(num)));

    }

}
