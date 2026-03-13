import java.util.Scanner;

public class VetorSemRepeticao10 {

    public static Scanner input = new Scanner(System.in);
    public static final int TAM = 10;

    public static void main(String[] args) {

        int[] numeros = new int[TAM];

        for (int i = 0; i < numeros.length; i += 1) {

            int valor;
            boolean repetido;

            do {
                repetido = false;

                System.out.print("Digite um número: ");
                valor = input.nextInt();

                for (int j = 0; j < i; j += 1) {
                    if (numeros[j] == valor) {
                        repetido = true;
                        System.out.println("Número repetido! Digite outro.");
                        break;
                    }
                }

            } while (repetido);

            numeros[i] = valor;
        }

        System.out.println("\nNúmeros digitados:");

        for (int i = 0; i < numeros.length; i += 1) {
            System.out.print(numeros[i] + " ");
        }
    }
}