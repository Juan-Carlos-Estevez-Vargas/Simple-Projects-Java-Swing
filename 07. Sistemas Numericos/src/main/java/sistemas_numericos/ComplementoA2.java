package sistemas_numericos;

public class ComplementoA2 {

    public void binComplementoA2(int binario) {

        String cadenaBinario = String.valueOf(binario);
        int indice = cadenaBinario.length() + 1;
        int resultado = Integer.parseInt(Binario.binarioDecimal(binario));

        int x = (int) Math.pow(2, indice);
        int a2 = x - resultado;

        System.out.println(Integer.toBinaryString(a2));

    }

}
