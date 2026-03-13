import java.ultil.Scanner;

public class Idade {
    public static Scanner input = new Scanner(System.in);
    public static final int ANO_ATUAL = 2026;
    public static void main(String[] args) {
        System.out.println("Digite a sua idade");
        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("Você já pode tirar carteira de motorista");
        } else {
          System.out.println ("Você ainda não pode tirar a carteira de motorista")              
        }
        if (idade <16){
            System.ou.println("Você ainda não pode tirar a carteira de motorista");
        } else if (idade < 18) {
            System.out.println("Você pode tirar o titulo de eleitor e votar!");
        } else if (idade < 70) {
            System.out.println("É obrigatório ter o titulo de eleitor e votar!");
        } else {
            System.out.println("Você não tem obrigação de votar!")
        }
        int anoNasc = ANO_ATUAL - idade;
        System.out.println("Você provavelmente nasceu em:" + anoNasc);
    }
}