
import java.util.Scanner;

public class ConjuntosEnteros {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        met.menu();
    }

}

class Metodos {

    int[] A, B, C;
    int tamA, tamB, x = 0;
    Scanner entrada = new Scanner(System.in);

    public void llenarA() {
        System.out.println("\n---------------------------------------------\n"
                + "-   *****   Ingrese el tamaño de A  *****   -\n"
                + "---------------------------------------------");
        tamA = entrada.nextInt();
        A = new int[tamA];

        System.out.println("\n-------------------------\n"
                + "-       llenando A      -\n"
                + "-------------------------");
        for (int i = 0; i < tamA; i++) {
            System.out.println("Ingrese un nùmero -> ");
            A[i] = entrada.nextInt();
        }
    }

    public void llenarB() {
        System.out.println("\n---------------------------------------------\n"
                + "-   *****   Ingrese el tamaño de B  *****   -\n"
                + "---------------------------------------------");
        tamB = entrada.nextInt();
        B = new int[tamB];

        System.out.println("\n-------------------------\n"
                + "-       llenando B      -\n"
                + "-------------------------");
        for (int i = 0; i < tamB; i++) {
            System.out.println("Ingrese un nùmero -> ");
            B[i] = entrada.nextInt();
        }
    }

    public void Union() {
        C = new int[100];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    A[i] = 0;
                }
            }
        }

        System.out.println("\n------------------------\n"
                + "-       A UNION B      -\n"
                + "------------------------");
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                System.out.println(A[i]);
            }
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }

    public void Interseccion() {
        int s = 0;
        C = new int[100];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    C[s] = A[i];
                    s++;
                }
            }
        }

        System.out.println("\n-------------------------------\n"
                + "-       A INTERSECCION B      -\n"
                + "-------------------------------");
        for (int i = 0; i < s; i++) {
            System.out.print(C[i] + " - ");
        }
    }

    public void Diferencia() {
        C = new int[100];
        int k = 0, cont;

        for (int i = 0; i < A.length; i++) {
            cont = 0;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    cont++;
                }
            }

            if (cont == 0) {
                C[k] = A[i];
                k++;
            }

        }

        System.out.println("\n---------------------------\n"
                + "-           A - B         -\n"
                + "---------------------------");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " - ");
        }
    }

    public void ARelacionB() {
        System.out.println("-------------\n"
                + "-   A R B   -\n"
                + "-------------");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.println("-   (" + A[i] + "," + B[j] + "),    -");
            }
        }
        System.out.println("-------------");
    }

    public void Subconjunto() {
        int contador = 0;
        System.out.println("------------------------\n"
                + "-   A Subconjunto B    -\n"
                + "------------------------");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    contador++;
                }
            }
        }

        if (contador == B.length) {
            System.out.println("*****   A es un subconjunto de B    *****");
        } else {
            System.out.println("*****   A NO es un subconjunto de B    *****");
        }
    }

    public void Complemento() {
        C = new int[100];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    B[j] = 0;
                }
            }
        }

        System.out.println("\n----------------------------\n"
                + "-       A COMPLEMENTO B    -\n"
                + "----------------------------");
        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                System.out.println(B[i]);
            }
        }
    }

    public void menu() {
        int opc;
        System.out.println("\n\n------------------------------------------\n"
                + "-        OPERACIONES CON CONJUNTOS       -\n"
                + "------------------------------------------\n"
                + "-    1. Uniòn                            -\n"
                + "-    2. Intersecciòn                     -\n"
                + "-    3. A diferencia B                   -\n"
                + "-    4. A complemento B                  -\n"
                + "-    5. A relacion B                     -\n"
                + "-    6. Subconjunto                      -\n"
                + "-    7. Salir                            -\n"
                + "------------------------------------------");
        System.out.println("-   Digite su opciòn                     -\n"
                + "------------------------------------------\n");

        opc = entrada.nextInt();
        switch (opc) {
            case 1:
                llenarA();
                llenarB();
                Union();
                menu();
                break;
            case 2:
                llenarA();
                llenarB();
                Interseccion();
                menu();
                break;
            case 3:
                llenarA();
                llenarB();
                Diferencia();
                menu();
                break;
            case 4:
                llenarA();
                llenarB();
                Complemento();
                menu();
                break;
            case 5:
                llenarA();
                llenarB();
                ARelacionB();
                menu();
                break;
            case 6:
                llenarA();
                llenarB();
                Subconjunto();
                menu();
                break;
            case 7:
                System.out.println("\n-------------------------------------------------\n"
                        + "+               Sesiòn culminada                -\n"
                        + "-------------------------------------------------");
                break;
            default:
                menu();
                break;
        }
    }
}
